package behavioral.chain_of_responsibility.handlers;

import behavioral.chain_of_responsibility.Database;

public class RoleCheckHandler extends Handler {
    public RoleCheckHandler(Database database) {
        super(database);
    }

    @Override
    public boolean handle(String user, String password) {
        System.out.println("Executing handler " + RoleCheckHandler.class.getSimpleName());
        if ("admin".equals(user)) {
            System.out.println("Loading admin page.....");
            return true;
        }

        return handleNext(user, password);
    }
}
