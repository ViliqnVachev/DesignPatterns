package structural.decorator;

public class IceCreamDecorator implements IIceCream {

    private IIceCream iIceCream;

    public IceCreamDecorator(IIceCream iIceCream) {
        this.iIceCream = iIceCream;
    }

    @Override
    public double cost() {
        return iIceCream.cost();
    }
}
