package creational.factory_method.store;

import creational.factory_method.abstraction.HamburgerStore;
import creational.factory_method.abstraction.Hamburger;
import creational.factory_method.model.JamaicanCheeseBurger;
import creational.factory_method.model.JamaicanVeggieBurger;

public class JamHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {

        if (type.equals("cheese")) {
            return new JamaicanCheeseBurger();
        } else if (type.equals("veggie")) {
            return new JamaicanVeggieBurger();
        } else {
            return null;
        }
    }
}
