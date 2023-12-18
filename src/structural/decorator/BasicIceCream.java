package structural.decorator;

public class BasicIceCream implements IIceCream{
    public BasicIceCream() {
        System.out.println("Creating a basic Ice-Cream!");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
