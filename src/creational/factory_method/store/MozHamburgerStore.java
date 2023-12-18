package creational.factory_method.store;

import creational.factory_method.abstraction.HamburgerStore;
import creational.factory_method.abstraction.Hamburger;
import creational.factory_method.model.MozambicanCheeseBurger;
import creational.factory_method.model.MozambicanVeggieBurger;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {

        if (type.equals("cheese")) {
            return new MozambicanCheeseBurger();
        }else if (type.equals("Veggie")) {
            return new MozambicanVeggieBurger();

        } else {
            return null;
        }

    }
}
