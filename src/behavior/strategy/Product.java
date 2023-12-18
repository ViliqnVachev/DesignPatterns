package behavior.strategy;

public class Product {
    private double price;
    private String upcCode;

    public Product(double price, String upcCode) {
        this.price = price;
        this.upcCode = upcCode;
    }

    public double getPrice() {
        return price;
    }

    public String getUpcCode() {
        return upcCode;
    }
}
