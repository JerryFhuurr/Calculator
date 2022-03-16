import CalculatorSide.CalculatorVisitor;
import OperatorSide.Operation;
import OperatorSide.Token;

import java.util.ArrayList;

public class Client {

    private CalculatorVisitor visitor;

    public Client() {
        this.visitor = new CalculatorVisitor();
    }

    public int evaluateExpression(ArrayList<Token> tokenArrayList) {

        return visitor.getResult();
    }
}
