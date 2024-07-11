package behavioral.state.states;

import behavioral.state.VendingMachine;

public class SoldOutState extends BaseAbstractState {
    public SoldOutState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertMoney() {
        System.out.println("Machine is sold out");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Insert money first");
    }

    @Override
    public void select() {
        System.out.println("No soda");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out");
    }

    @Override
    public String toString() {
        return "Sold out";
    }
}
