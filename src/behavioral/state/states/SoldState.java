package behavioral.state.states;

import behavioral.state.VendingMachine;

public class SoldState extends BaseAbstractState {
    public SoldState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void insertMoney() {
        System.out.println("Soda is coming");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Sorry soda is coming.... Can not eject the money");
    }

    @Override
    public void select() {
        System.out.println("Sorry soda is coming....");
    }

    @Override
    public void dispense() {
        System.out.println("Stop trying to get soda for free`");
        if (machine.getQuantity() > 0) {
            machine.setQuantity(machine.getQuantity() - 1);
            machine.setState(new NoMoneyState(machine));
        } else {
            System.out.println("Sorry no more sodas");
            machine.setState(new SoldOutState(machine));
        }
    }

    @Override
    public String toString() {
        return "Dispensing soda...";
    }
}
