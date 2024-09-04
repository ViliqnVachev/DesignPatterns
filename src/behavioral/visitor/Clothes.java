package behavioral.visitor;

public abstract class Clothes implements IVisitable {
    private final String color;
    private final double price;

    Clothes(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
