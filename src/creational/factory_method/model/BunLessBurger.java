package creational.factory_method.model;

import creational.factory_method.abstraction.Hamburger;

public class BunLessBurger extends Hamburger {
    public BunLessBurger() {
        name = "Bunless Burger";
        sauce = "Spicy sauce";
        buns = "Lettuce wrap!";
    }


}
