package structural.proxy;

import java.util.HashSet;
import java.util.Set;
import structural.proxy.interfaces.IBank;

public class BankProxy implements IBank {
    private final IBank bank = new Bank();
    private static final Set<String> bannedUsers= new HashSet<>();

    static {
        bannedUsers.add("unknown");
        bannedUsers.add("asd");
        bannedUsers.add("dsa");
    }

    @Override
    public void withdrawMoney(String user) throws IllegalAccessException {
        if (!bannedUsers.contains(user)) {
            bank.withdrawMoney(user);
        }else {
            throw new IllegalAccessException("The user is not permitted for this operation");
        }

    }
}
