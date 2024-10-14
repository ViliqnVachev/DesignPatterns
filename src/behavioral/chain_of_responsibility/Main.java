package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.handlers.Handler;
import behavioral.chain_of_responsibility.handlers.RoleCheckHandler;
import behavioral.chain_of_responsibility.handlers.ValidPasswordHandler;
import behavioral.chain_of_responsibility.handlers.ValidUserHandler;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new ValidUserHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler(database));
         AuthService authService= new AuthService(handler);
         authService.login("admin","admin");
    }
}
