package creational.factory_method.model;

import creational.factory_method.abstraction.Hamburger;

public class VeggieBurger extends Hamburger {

    public VeggieBurger() {
        name = "Veggie Burger";
        sauce = "No sauce";
        buns = "Lettuce wrap!";
    }
}
