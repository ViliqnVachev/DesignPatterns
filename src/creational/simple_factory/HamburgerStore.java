package creational.simple_factory;

import creational.simple_factory.factory.SimpleHamburgerFactory;
import creational.simple_factory.model.Hamburger;

public class HamburgerStore {
    private final SimpleHamburgerFactory simpleHamburgerFactory;

    public HamburgerStore(SimpleHamburgerFactory simpleHamburgerFactory) {
        this.simpleHamburgerFactory = simpleHamburgerFactory;
    }

    public Hamburger orderHamburger(String type) {

        Hamburger hamburger = simpleHamburgerFactory.createHamburger(type);
        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

        return hamburger;
    }
}
