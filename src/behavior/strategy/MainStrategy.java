package behavior.strategy;

import behavior.strategy.algorithms.CreditCardAlgorithm;
import behavior.strategy.algorithms.PaypalAlgorithm;

public class MainStrategy {
    public static void main(String[] args) {
        Product table= new Product(50,"123");
        Product chair= new Product(100,"1235");

        ShoppingCartContext cart= new ShoppingCartContext();
        cart.addProduct(table);
        cart.addProduct(chair);

        cart.pay(new CreditCardAlgorithm("Pesho", "123456789"));
        cart.pay(new PaypalAlgorithm("Gosho@abv.bg", "123456789"));
    }
}
