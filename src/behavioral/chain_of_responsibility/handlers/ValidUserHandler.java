package behavioral.chain_of_responsibility.handlers;

import behavioral.chain_of_responsibility.Database;

public class ValidUserHandler extends Handler {

    public ValidUserHandler(Database database) {
        super(database);
    }

    @Override
    public boolean handle(String user, String password) {
        System.out.println("Executing handler " + ValidUserHandler.class.getSimpleName());
        if (!database.isValidUser(user)) {
            System.out.println("This user is not register...");
            return false;
        }
        return handleNext(user, password);
    }
}
