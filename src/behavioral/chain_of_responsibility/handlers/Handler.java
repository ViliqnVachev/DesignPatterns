package behavioral.chain_of_responsibility.handlers;

import behavioral.chain_of_responsibility.Database;

public abstract class Handler {
    private Handler next;
    protected Database database;

    public Handler(Database database) {
        this.database = database;
    }

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String user, String password);

    protected boolean handleNext(String user, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(user, password);
    }
}
