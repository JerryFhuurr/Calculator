package OperatorSide;

import CalculatorSide.CalculatorVisitor;

public class Operand extends Token{
    private int value;

    public Operand(int value, CalculatorVisitor visitor){
        super(visitor);
        this.value = value;
    }

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }

    public int getValue(){
        return value;
    }
}
