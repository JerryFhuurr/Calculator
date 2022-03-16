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
    public void visit(Operator operator) {
        performOperation(operator);
    }

    private void pushOperand(Operand operand) {
        tokenStack.push(operand.getValue());
    }

    private void performOperation(Operator operator) {
        //calculation

    }
}
