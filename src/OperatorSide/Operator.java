package OperatorSide;

import CalculatorSide.Calculator;
import CalculatorSide.CalculatorVisitor;

public class Operator extends Token {
    private Operation operation;

    public Operator(Operation operation, CalculatorVisitor visitor) {
        super(visitor);
        this.operation = operation;
    }

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }

    public Operation getOperation() {
        return operation;
    }
}
