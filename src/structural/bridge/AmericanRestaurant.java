package structural.bridge;

public class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        super.pizza.setSauce("Super secret recipe");
    }

    @Override
    protected void addToppings() {
        super.pizza.setToppings("Everything");
    }

    @Override
    protected void makeCrust() {
        super.pizza.setCrust("Thick");
    }
}
