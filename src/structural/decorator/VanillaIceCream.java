package structural.decorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IIceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice-Cream!");
        return 1.0 + super.cost();
    }
}
