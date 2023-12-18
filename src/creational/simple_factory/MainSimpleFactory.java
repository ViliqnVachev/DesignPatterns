package creational.simple_factory;

import creational.simple_factory.factory.SimpleHamburgerFactory;

public class MainSimpleFactory {
    public static void main(String[] args) {
        HamburgerStore store = new HamburgerStore(new SimpleHamburgerFactory());

        store.orderHamburger("cheese");
        System.out.println("===Order completed===");
        store.orderHamburger("greek");
        System.out.println("===Order completed===");

    }
}
