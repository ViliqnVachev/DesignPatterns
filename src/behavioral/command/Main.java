package behavioral.command;

import behavioral.command.commands.Command;
import behavioral.command.commands.DownCommand;
import behavioral.command.commands.LeftCommand;
import behavioral.command.commands.RightCommand;
import behavioral.command.commands.UpCommand;
import behavioral.command.models.CharacterReceiver;
import behavioral.command.models.Mario;
import behavioral.command.models.Sonic;

public class Main {
    public static void main(String[] args) {

        CharacterReceiver mario = new Mario("Mario");
        CharacterReceiver sonic = new Sonic();

        Command downCommand = new DownCommand(mario);
        Command upCommand = new UpCommand(mario);
        Command rightCommand = new RightCommand(mario);
        Command leftCommand = new LeftCommand(mario);

        GameBoy gameBoy = new GameBoy(downCommand, upCommand, leftCommand, rightCommand);
        gameBoy.arrowDown();
        gameBoy.arrowUp();
        gameBoy.arrowLeft();
        gameBoy.arrowRight();

        downCommand = new DownCommand(sonic);
        upCommand = new UpCommand(sonic);
        rightCommand = new RightCommand(sonic);
        leftCommand = new LeftCommand(sonic);
        gameBoy = new GameBoy(downCommand, upCommand, leftCommand, rightCommand);
        System.out.println("=======");

        gameBoy.arrowDown();
        gameBoy.arrowUp();
        gameBoy.arrowLeft();
        gameBoy.arrowRight();
    }
}
