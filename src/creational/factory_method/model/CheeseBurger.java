package creational.factory_method.model;

import creational.factory_method.abstraction.Hamburger;

public class CheeseBurger extends Hamburger {

    public CheeseBurger() {
        name = "Cheese Burger";
        sauce = "Cheese sauce";
        buns = "Buns wrap!";
    }
}
