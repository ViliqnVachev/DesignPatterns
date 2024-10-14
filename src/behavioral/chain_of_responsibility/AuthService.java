package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.handlers.Handler;

public class AuthService {

    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Auth was successful!");
            return true;
        }
        return false;
    }
}
