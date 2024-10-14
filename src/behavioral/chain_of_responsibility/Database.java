package behavioral.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, String> database;

    public Database() {
        database = new HashMap<>();
        database.put("admin", "admin");
        database.put("user", "123");
    }

    public boolean isValidUser(String user) {
        return database.containsKey(user);
    }

    public boolean isValidPassword(String user, String password) {
        return database.get(user).equals(password);
    }
}
