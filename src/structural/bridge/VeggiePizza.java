package structural.bridge;

public class VeggiePizza extends Pizza {
    @Override
    protected void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: " + toppings);
        System.out.println("Adding Cheese");
    }

    @Override
    protected void qualityCheck() {
        System.out.println("Crust is: " + crust);
    }
}
