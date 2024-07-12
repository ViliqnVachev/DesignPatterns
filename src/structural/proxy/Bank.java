package structural.proxy;

import structural.proxy.interfaces.IBank;

public class Bank implements IBank {
    @Override
    public void withdrawMoney(String user) {
        System.out.println(user + " withdrawing money...");
    }
}
