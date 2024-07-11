package behavioral.state;

import behavioral.state.states.IState;
import behavioral.state.states.NoMoneyState;
import behavioral.state.states.SoldOutState;

public class VendingMachine implements IState {
    private IState state;
    private int quantity;

    public VendingMachine(int quantity) {
        setQuantity(quantity);
        if (quantity > 0) {
            state = new NoMoneyState(this);
        } else {
            state = new SoldOutState(this);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    @Override
    public void insertMoney() {
        state.insertMoney();
    }

    @Override
    public void ejectMoney() {
        state.ejectMoney();
    }

    @Override
    public void select() {
        state.select();
    }

    @Override
    public void dispense() {
        state.dispense();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator())
                .append("The soda machine, CO")
                .append(System.lineSeparator())
                .append("Inventory: " + getQuantity())
                .append(System.lineSeparator())
                .append("Soda vending machine is " + state)
                .append(System.lineSeparator());

        return sb.toString();
    }
}
