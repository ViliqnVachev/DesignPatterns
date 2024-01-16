package behavioral.command.commands;

import behavioral.command.models.CharacterReceiver;

public class RightCommand implements Command {
    private CharacterReceiver characterReceiver;

    public RightCommand(CharacterReceiver characterReceiver) {
        this.characterReceiver = characterReceiver;
    }

    @Override
    public void execute() {
        characterReceiver.moveRight();
    }
}
