package CalculatorSide;

import ListSide.LinkedStack;
import OperatorSide.Operand;
import OperatorSide.Operator;
import OperatorSide.Token;

import java.lang.reflect.MalformedParametersException;

public class CalculatorVisitor implements Visitor, Calculator{
    private LinkedStack<Token> tokenStack;

    @Override
    public int getResult() {
        return 0;
    }

    @Override
    public void visit(Operand operand) {
        operand.accept(this);
    }

    @Override
    public void visit(Operator operator) {
        operator.accept(this);
    }

    private void pushOperand(Operand operand){
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator){

    }
}
