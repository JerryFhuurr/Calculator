package OperatorSide;

import CalculatorSide.CalculatorVisitor;
import CalculatorSide.MalformedExpressionException;

public class Operator extends Token {
    private Operation operation;

    public Operator(Operation operation, CalculatorVisitor visitor) {
        super(visitor);
        this.operation = operation;
    }

    @Override
    public void accept(CalculatorVisitor visitor) throws MalformedExpressionException {
        visitor.visit(this);
    }

    public Operation getOperation() {
        return operation;
    }
}
