package behavioral.chain_of_responsibility.handlers;

import behavioral.chain_of_responsibility.Database;

public class ValidPasswordHandler extends Handler {

    public ValidPasswordHandler(Database database) {
        super(database);
    }

    @Override
    public boolean handle(String user, String password) {
        System.out.println("Executing handler " + ValidPasswordHandler.class.getSimpleName());
        if (!database.isValidPassword(user, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return handleNext(user, password);
    }
}
