package creational.simple_factory.factory;

import creational.simple_factory.model.BunLessBurger;
import creational.simple_factory.model.CheeseBurger;
import creational.simple_factory.model.GreekBurger;
import creational.simple_factory.model.Hamburger;
import creational.simple_factory.model.MeatLover;
import creational.simple_factory.model.VeggieBurger;

public final class SimpleHamburgerFactory {
    public Hamburger createHamburger(String type) {
        //We add types
        switch (type) {
        case "cheese":
            return new CheeseBurger();
        case "greek":
            return new GreekBurger();
        case "meatLover":
            return new MeatLover();
        case "veggie":
            return new VeggieBurger();
        case "bunLess":
            return new BunLessBurger();
        default:
            throw new UnsupportedOperationException("Unsupported type");
        }
    }
}
