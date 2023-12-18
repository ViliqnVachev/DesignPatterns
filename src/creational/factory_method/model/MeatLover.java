package creational.factory_method.model;

import creational.factory_method.abstraction.Hamburger;

public class MeatLover extends Hamburger {

    public MeatLover() {
        name = "MeatLover Burger";
        sauce = "Spicy sauce";
        buns = "No wrap!";
    }
}
