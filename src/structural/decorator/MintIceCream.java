package structural.decorator;

public class MintIceCream extends IceCreamDecorator{
    public MintIceCream(IIceCream iIceCream) {
        super(iIceCream);
    }

    public double cost() {
        System.out.println("Adding Mint Ice-Cream!");
        return 1.5 + super.cost();
    }
}
