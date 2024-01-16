package behavioral.command.commands;

import behavioral.command.models.CharacterReceiver;

public class UpCommand implements Command {

    private CharacterReceiver characterReceiver;

    public UpCommand(CharacterReceiver characterReceiver) {
        this.characterReceiver = characterReceiver;
    }

    @Override
    public void execute() {
        characterReceiver.moveUp();
    }
}
