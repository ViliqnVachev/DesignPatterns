package behavioral.interpeter;

public class Main {
    public static void main(String[] args) {
        String hex = "28 in Hex";
        String bin = "13 in Bin";
        Client client = new Client(new InterpreterContext());
        System.out.println(client.interpreter(hex));
        System.out.println(client.interpreter(bin));
    }
}
