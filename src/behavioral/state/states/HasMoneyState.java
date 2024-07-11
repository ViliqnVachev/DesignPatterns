package behavioral.state.states;

import behavioral.state.VendingMachine;

public class HasMoneyState extends BaseAbstractState {
    public HasMoneyState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertMoney() {
        System.out.println("No need to insert another dollar.");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Take you money");
        machine.setState(new NoMoneyState(machine));
    }

    @Override
    public void select() {
        System.out.println("Selected an item...");
        machine.setState(new SoldState(machine));
    }

    @Override
    public void dispense() {
        System.out.println("No soda dispensed");
    }

    @Override
    public String toString() {
        return "Waiting for a new selection...";
    }
}
