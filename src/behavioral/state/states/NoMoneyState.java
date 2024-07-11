package behavioral.state.states;

import behavioral.state.VendingMachine;

public class NoMoneyState extends BaseAbstractState {
    public NoMoneyState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertMoney() {
        System.out.println("You inserted a dollar.");
        machine.setState(new HasMoneyState(machine));
    }

    @Override
    public void ejectMoney() {
        System.out.println("You have not inserted a dollar.");
    }

    @Override
    public void select() {
        System.out.println("Selected, but there is no money.");
    }

    @Override
    public void dispense() {
        System.out.println("No money, pay first!");
    }

    @Override
    public String toString() {
        return "Waiting for a dollar";
    }
}
