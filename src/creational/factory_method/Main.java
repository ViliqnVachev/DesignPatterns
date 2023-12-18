package creational.factory_method;

import creational.factory_method.abstraction.HamburgerStore;
import creational.factory_method.abstraction.Hamburger;
import creational.factory_method.store.JamHamburgerStore;
import creational.factory_method.store.MozHamburgerStore;

public class Main {
    public static void main(String[] args) {

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerStore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n");

        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");

    }
}
