import CalculatorSide.Calculator;
import CalculatorSide.CalculatorVisitor;
import CalculatorSide.MalformedExpressionException;
import OperatorSide.Operand;
import OperatorSide.Operation;
import OperatorSide.Operator;
import OperatorSide.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Client client;
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new CalculatorVisitor();
        client = new Client((CalculatorVisitor) calculator);

    }

    @Test
    public void evaluateExpression() throws MalformedExpressionException
    {
        ArrayList<Token> tokenList = new ArrayList<>();
        Operand operand1 = new Operand(2, (CalculatorVisitor) calculator);
        Operand operand2 = new Operand(4, (CalculatorVisitor) calculator);
        Operand operand3 = new Operand(16, (CalculatorVisitor) calculator);
        Operand operand4 = new Operand(6, (CalculatorVisitor) calculator);
        Operand operand5 = new Operand(8, (CalculatorVisitor) calculator);
        Operator operator1 = new Operator(Operation.plus, (CalculatorVisitor) calculator);
        Operator operator2 = new Operator(Operation.minus, (CalculatorVisitor) calculator);
        Operator operator3 = new Operator(Operation.divide, (CalculatorVisitor) calculator);
        Operator operator4 = new Operator(Operation.multiply, (CalculatorVisitor) calculator);
        tokenList.add(operand1);
        tokenList.add(operand2);
        tokenList.add(operand3);
        tokenList.add(operand4);
        tokenList.add(operand5);
        tokenList.add(operator1);
        tokenList.add(operator2);
        tokenList.add(operator3);
        tokenList.add(operator4);  //2 4 16 6 8 + - * /  ==> 2 * 4 / (16 - (6 + 8))

        System.out.println(client.evaluateExpression(tokenList));

        assertEquals(4,client.evaluateExpression(tokenList));


    }
}
