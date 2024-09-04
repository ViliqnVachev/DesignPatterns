package structural.proxy;

import structural.proxy.interfaces.IBank;

public class Main {
    public static void main(String[] args) {
        IBank bank= new BankProxy();
        try {
            bank.withdrawMoney("vvachev");
            bank.withdrawMoney("unknown");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
