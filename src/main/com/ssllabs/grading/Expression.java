package com.ssllabs.grading;

import java.util.Stack;

public class Expression {

    private Stack<Operator> operators = new Stack<>();

    private Stack<Object> operands = new Stack<>();

    public Expression() {
        System.err.println("--------------------");
    }

    public void pushOperand(Object o) {
        System.err.println("Pushed operand: " + o);
        operands.push(o);
    }

    public void pushOperator(Operator o) {
        System.err.println("Pushed operator: " + o);
        operators.push(o);
    }

    public void evaluateEQ() {
        Object o1 = operands.pop();
        Object o2 = operands.pop();
        operands.push(o1.equals(o2));
    }

    public void evaluateNEQ() {
        Object o1 = operands.pop();
        Object o2 = operands.pop();
        operands.push(!o1.equals(o2));
    }

    public void evaluateLT() {
        Integer i1 = (Integer)operands.pop();
        Integer i2 = (Integer)operands.pop();
        operands.push(i2 < i1);
    }

    public void evaluateLTE() {
        Integer i1 = (Integer)operands.pop();
        Integer i2 = (Integer)operands.pop();
        operands.push(i2 <= i1);
    }

    public void evaluateGT() {
        Integer i1 = (Integer)operands.pop();
        Integer i2 = (Integer)operands.pop();
        operands.push(i2 > i1);
    }

    public void evaluateGTE() {
        Integer i1 = (Integer)operands.pop();
        Integer i2 = (Integer)operands.pop();
        operands.push(i2 >= i1);
    }

    public boolean evaluate() {
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

            Boolean r = (Boolean)operands.pop();
            System.err.println("# Returning " + r);
            return r;
        }
    }
}
