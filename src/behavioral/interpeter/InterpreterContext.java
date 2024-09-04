package behavioral.interpeter;

public class InterpreterContext {

    public String getBinaryFormat(int data) {
        return Integer.toBinaryString(data);
    }

    public String getHexFormat(int data) {
        return Integer.toHexString(data);
    }
}
