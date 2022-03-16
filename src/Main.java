import CalculatorSide.Calculator;
import CalculatorSide.CalculatorVisitor;
import CalculatorSide.MalformedExpressionException;
import OperatorSide.Operand;
import OperatorSide.Operation;
import OperatorSide.Operator;
import OperatorSide.Token;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorVisitor();
        Client client = new Client((CalculatorVisitor) calculator);


        Operand operand1 = new Operand(3, (CalculatorVisitor) calculator);
        Operand operand2 = new Operand(4, (CalculatorVisitor) calculator);
        Operand operand3 = new Operand(5, (CalculatorVisitor) calculator);
        Operand operand4 = new Operand(6, (CalculatorVisitor) calculator);
        Operator operator1 = new Operator(Operation.plus, (CalculatorVisitor) calculator);
        Operator operator2 = new Operator(Operation.multiply, (CalculatorVisitor) calculator);
        Operator operator3 = new Operator(Operation.minus, (CalculatorVisitor) calculator);
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(operand1);
        tokens.add(operand2);
        tokens.add(operator1);
        tokens.add(operand3);
        tokens.add(operator2);
        tokens.add(operand4);
        tokens.add(operator3);

        try {
            System.out.println(client.evaluateExpression(tokens));
        } catch (MalformedExpressionException e) {
            System.out.println(e.getMessage());
        }

    }
}
