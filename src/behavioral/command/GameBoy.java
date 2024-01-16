package behavioral.command;

import behavioral.command.commands.Command;

public class GameBoy implements Invoker {

    private Command downCommand;
    private Command upCommand;
    private Command leftCommand;
    private Command rightCommand;

    public GameBoy(Command downCommand, Command upCommand, Command leftCommand, Command rightCommand) {
        this.downCommand = downCommand;
        this.upCommand = upCommand;
        this.leftCommand = leftCommand;
        this.rightCommand = rightCommand;
    }

    public void arrowUp() {
        upCommand.execute();
    }

    public void arrowDown() {
        downCommand.execute();
    }

    public void arrowRight() {
        rightCommand.execute();
    }

    public void arrowLeft() {
        leftCommand.execute();
    }

}
