import CalculatorSide.CalculatorVisitor;
import CalculatorSide.MalformedExpressionException;
import OperatorSide.Token;

import java.util.ArrayList;

public class Client {

    private final CalculatorVisitor visitor;

    public Client(CalculatorVisitor visitor) {
        this.visitor = visitor;
    }

    public int evaluateExpression(ArrayList<Token> tokenArrayList) throws MalformedExpressionException {
        for (Token t : tokenArrayList) {
            t.accept(visitor);
        }
        return visitor.getResult();
    }
}
