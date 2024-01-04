package structural.decorator;

public abstract class IceCreamDecorator implements IIceCream {

    private final IIceCream iIceCream;

    public IceCreamDecorator(IIceCream iIceCream) {
        this.iIceCream = iIceCream;
    }

    @Override
    public double cost() {
        return iIceCream.cost();
    }
}
