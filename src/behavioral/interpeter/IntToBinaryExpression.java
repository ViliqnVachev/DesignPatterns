package behavioral.interpeter;

public class IntToBinaryExpression implements Expression {
    public final int data;

    public IntToBinaryExpression(int data) {
        this.data = data;
    }

    @Override
    public String interpreter(InterpreterContext context) {
        return context.getBinaryFormat(data);
    }
}
