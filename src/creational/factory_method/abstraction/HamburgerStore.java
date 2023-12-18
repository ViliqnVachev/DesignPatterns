package creational.factory_method.abstraction;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type) {
        Hamburger burger;

        //We now user our factory! Not the if statements.
        burger = createHamburger(type);  //factory.createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;

    }

    public abstract Hamburger createHamburger(String type);
}
