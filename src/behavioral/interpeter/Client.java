package behavioral.interpeter;

public class Client {

    private final InterpreterContext context;

    public Client(InterpreterContext context) {
        this.context = context;
    }

    public String interpreter(String str) {
        Expression expression;
        if (str.contains("Hex")) {
            expression = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }

        return expression.interpreter(context);
    }
}
