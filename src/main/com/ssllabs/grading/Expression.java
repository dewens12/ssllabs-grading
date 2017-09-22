package com.ssllabs.grading;

import java.util.Stack;

public class Expression {

    private Stack<Operator> operators = new Stack<>();

    private Stack<Object> operands = new Stack<>();

    public void pushOperand(Object o) {
        operands.push(o);
    }

    public void pushOperator(Operator o) {
        operators.push(o);
    }

    public void evaluateEq() {
        Object o1 = operands.pop();
        Object o2 = operands.pop();
        operands.push(o1.equals(o2));
    }

    public void evaluateNeq() {
        Object o1 = operands.pop();
        Object o2 = operands.pop();
        operands.push(!o1.equals(o2));
    }

    public boolean evaluate() {
        for (; ; ) {
            if (operators.empty()) {
                break;
            }

            Operator op = operators.pop();

            switch (op) {

                case eq:
                    evaluateEq();
                    break;

                case neq:
                    evaluateNeq();
                    break;

                default:
                    throw new RuntimeException("Unknown operator: " + op);
            }
        }

        if (operands.empty()) {
            return false;
        } else {
            if (operands.size() != 1) {
                throw new RuntimeException("Internal error: ended with more than one operand");
            }

            return (Boolean) operands.pop();
        }
    }
}
