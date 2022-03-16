package CalculatorSide;

import ListSide.LinkedStack;
import OperatorSide.Operand;
import OperatorSide.Operation;
import OperatorSide.Operator;
import OperatorSide.Token;


public class CalculatorVisitor implements Visitor, Calculator {
    private LinkedStack<Token> tokenStack;

    public CalculatorVisitor() {
        this.tokenStack = new LinkedStack<>();
    }

    @Override
    public int getResult() {
        Operand operand = (Operand) tokenStack.pop();
        return operand.getValue();
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) throws MalformedExpressionException {
        performOperation(operator);
    }

    private void pushOperand(Operand operand) {
        tokenStack.push(operand.getValue());
    }

    private void performOperation(Operator operator) throws MalformedExpressionException {
        //calculation
        Operand operand2 = (Operand) tokenStack.pop();
        Operand operand1 = (Operand) tokenStack.pop();
        if (operand1 != null || operand2 != null) {
            int value1 = operand1.getValue();
            int value2 = operand2.getValue();
            int result = 0;

            if (operator.getOperation().equals(Operation.plus)) {
                result = value1 + value2;
            } else if (operator.getOperation().equals(Operation.minus)) {
                result = value1 - value2;
            } else if (operator.getOperation().equals(Operation.multiply)) {
                result = value1 * value2;
            } else if (operator.getOperation().equals(Operation.divide)) {
                result = value1 / value2;
            }
            Operand resultOperand = new Operand(result, this);
            pushOperand(resultOperand);
        } else {
            throw new MalformedExpressionException("Not enough operands");
        }
    }
}
