package creational.factory_method.model;

import creational.factory_method.abstraction.Hamburger;

public class JamaicanVeggieBurger extends Hamburger {
    public JamaicanVeggieBurger() {
        name = "Jamaican Veggie Burger";
        sauce = "Jamaican No sauce";
        buns = "Jamaican Lettuce wrap!";
    }
}
