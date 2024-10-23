package structural.bridge;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        super.pizza.setSauce("Oil");
    }

    @Override
    protected void addToppings() {
        super.pizza.setToppings(null);
    }

    @Override
    protected void makeCrust() {
        super.pizza.setCrust("Thin");
    }
}
