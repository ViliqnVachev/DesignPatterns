package behavioral.strategy.algorithms;

public class CreditCardAlgorithm implements IPaymentStrategy {

    private String name;
    private String cardNumber;

    public CreditCardAlgorithm(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(String.format("%s paid with Credit card", amount));
    }
}
