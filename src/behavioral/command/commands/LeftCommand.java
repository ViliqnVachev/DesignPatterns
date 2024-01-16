package behavioral.command.commands;

import behavioral.command.models.CharacterReceiver;

public class LeftCommand implements Command{
    private CharacterReceiver characterReceiver;

    public LeftCommand(CharacterReceiver characterReceiver) {
        this.characterReceiver = characterReceiver;
    }

    @Override
    public void execute() {
        characterReceiver.moveLeft();
    }
}
