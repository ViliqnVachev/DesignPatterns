package behavioral.strategy;

import behavioral.strategy.algorithms.IPaymentStrategy;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartContext {

    private List<Product> productList;

    public ShoppingCartContext() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public void pay(IPaymentStrategy paymentStrategy) {
        double total = productList.stream().mapToDouble(Product::getPrice).sum();
        paymentStrategy.pay(total);
    }
}
