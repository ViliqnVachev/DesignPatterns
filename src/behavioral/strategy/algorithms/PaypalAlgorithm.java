package behavioral.strategy.algorithms;

public class PaypalAlgorithm implements IPaymentStrategy {

    private String email;
    private String password;

    public PaypalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(String.format("%s paid with PayPal", amount));
    }
}
