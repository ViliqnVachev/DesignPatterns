package structural.bridge;

public abstract class Restaurant {
    protected final Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    protected abstract void addSauce();
    protected abstract void addToppings();
    protected abstract void makeCrust();

    public void delivery(){
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in progress!");
    }
}
