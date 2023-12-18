package creational.factory_method.model;

import creational.factory_method.abstraction.Hamburger;

public class GreekBurger extends Hamburger {

    public GreekBurger() {
        name = "Greek Burger";
        sauce = "Dzadziki sauce";
        buns = "Lettuce wrap!";
    }
}
