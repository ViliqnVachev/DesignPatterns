package behavioral.interpeter;

public class IntToHexExpression implements Expression {
    private final int data;

    public IntToHexExpression(int data) {
        this.data = data;
    }

    @Override
    public String interpreter(InterpreterContext context) {
        return context.getHexFormat(data);
    }
}
