package CalculatorSide;

import OperatorSide.Operand;
import OperatorSide.Operator;

public interface Visitor {
    void visit(Operand operand);
    void visit(Operator operator);
}
