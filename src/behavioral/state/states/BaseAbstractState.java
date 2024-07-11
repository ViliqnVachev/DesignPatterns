package behavioral.state.states;

import behavioral.state.VendingMachine;

public abstract class BaseAbstractState implements IState {
    protected VendingMachine machine;

    protected BaseAbstractState(VendingMachine machine) {
        this.machine = machine;
    }
}
