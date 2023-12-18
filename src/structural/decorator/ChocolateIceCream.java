package structural.decorator;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IIceCream iIceCream) {
        super(iIceCream);
    }

    public double cost() {
        System.out.println("Adding Chocolate Ice-Cream!");
        return 2.0 + super.cost();
    }
}
