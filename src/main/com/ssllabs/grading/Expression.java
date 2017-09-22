package com.ssllabs.grading;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Expression {

    public static Boolean LIST_TERMINATOR = Boolean.TRUE;

    private Stack<Operator> operators = new Stack<>();

    private Stack<Object> operands = new Stack<>();

    private Map<String, Object> model;

    public Expression() {
        System.err.println("--------------------");
    }

    public Expression(Expression parent) {
        this(parent, null);
    }

    public Expression(Expression parent, Map<String, Object> model) {
        this();
        operators.addAll(parent.operators);
        operands.addAll(parent.operands);
        this.model = model;
    }

    public void pushOperand(Object o) {
        System.err.println("Pushed operand: " + o.toString());
        operands.push(o);
    }

    public Object popOperand() {
        Object o = operands.pop();
        System.err.println("Popped operand: " + o);

        if (o instanceof Reference) {
            Reference r = (Reference) o;
            o = resolveReference(r);
            if (o == null) {
                throw new RuntimeException("Unable to resolve reference: " + r.getName());
            }

            if (o instanceof Integer) {
                return o;
            }
        }

        return o;
    }

    private Object resolveReference(Reference r) {
        if (model == null) {
            return null;
        }

        return resolveReference(model, r.getName());
    }

    private Object resolveReference(Object root, String name) {
        String property = name;
        String extra = null;

        int i = name.indexOf(".");
        if (i != -1) {
            property = name.substring(0, i);
            extra = name.substring(i + 1);
        }

        return findObjectProperty(root, property, extra);
    }

    public Object findPropertyMethod(Object object, String property, String prefix) {
        try {
            String methodName = prefix + property.substring(0, 1).toUpperCase() + property.substring(1);
            Method method = object.getClass().getMethod(methodName);
            return method.invoke(object);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            return null;
        }
    }

    public Object findObjectProperty(Object object, String property, String extra) {
        Object child = null;

        if (object instanceof Map) {
            child = ((Map) object).get(property);
        } else {
            // Try access via getter methods first, "get" then "is".
            child = findPropertyMethod(object, property, "get");
            if (child == null) {
                child = findPropertyMethod(object, property, "is");
            }

            // Alternatively, try the field directly.
            if (child == null) {
                try {
                    Field field = object.getClass().getDeclaredField(property);
                    //field.setAccessible(true);
                    child = field.get(object);
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    // Ignoring.
                }
            }
        }

        if (child == null) {
            return null;
        }

        if (extra == null) {
            return child;
        } else {
            return resolveReference(child, extra);
        }
    }

    public void pushOperator(Operator o) {
        System.err.println("Pushed operator: " + o);
        operators.push(o);
    }

    public void evaluateEQ() {
        Object o1 = popOperand();
        Object o2 = popOperand();
        operands.push(o1.equals(o2));
    }

    public void evaluateGT() {
        Integer i1 = (Integer) popOperand();
        Integer i2 = (Integer) popOperand();
        operands.push(i2 > i1);
    }

    public void evaluateGTE() {
        Integer i1 = (Integer) popOperand();
        Integer i2 = (Integer) popOperand();
        operands.push(i2 >= i1);
    }

    public void evaluateIN() {
        Object needle = popOperand();

        boolean inList = false;
        Object o = popOperand();

        if (o instanceof List) {
            for (Object objectInList : (List) o) {
                if (needle.equals(objectInList)) {
                    inList = true;
                }
            }

            if (inList) {
                operands.push(true);
            } else {
                operands.push(false);
            }

            return;
        }

        while (o != Expression.LIST_TERMINATOR) {
            if (needle.equals(o)) {
                inList = true;
            }

            o = popOperand();
        }

        if (inList) {
            operands.push(true);
        } else {
            operands.push(false);
        }
    }

    public void evaluateLT() {
        Integer i1 = (Integer) popOperand();
        Integer i2 = (Integer) popOperand();
        operands.push(i2 < i1);
    }

    public void evaluateLTE() {
        Integer i1 = (Integer) popOperand();
        Integer i2 = (Integer) popOperand();
        operands.push(i2 <= i1);
    }

    public void evaluateNEQ() {
        Object o1 = popOperand();
        Object o2 = popOperand();
        operands.push(!o1.equals(o2));
    }

    public boolean evaluate() {
        Expression e = new Expression(this);
        return e.evaluateActual();
    }

    public boolean evaluate(Map<String, Object> model) {
        Expression e = new Expression(this, model);
        return e.evaluateActual();
    }

    private boolean evaluateActual() {
        for (; ; ) {
            if (operators.empty()) {
                break;
            }

            Operator op = operators.pop();

            switch (op) {

                case eq:
                    evaluateEQ();
                    break;

                case gt:
                    evaluateGT();
                    break;

                case gte:
                    evaluateGTE();
                    break;

                case in:
                    evaluateIN();
                    break;

                case lt:
                    evaluateLT();
                    break;

                case lte:
                    evaluateLTE();
                    break;

                case neq:
                    evaluateNEQ();
                    break;

                default:
                    throw new RuntimeException("Unknown operator: " + op);
            }
        }

        if (operands.empty()) {
            return false;
        } else {
            if (operands.size() != 1) {
                throw new RuntimeException("Internal error: ended with more than one operand: " + operands.size());
            }

            Boolean r = (Boolean) operands.pop();
            System.err.println("# Returning " + r);
            return r;
        }
    }
}
