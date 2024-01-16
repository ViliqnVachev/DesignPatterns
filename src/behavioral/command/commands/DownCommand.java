package behavioral.command.commands;

import behavioral.command.models.CharacterReceiver;

public class DownCommand implements Command{
    private CharacterReceiver characterReceiver;

    public DownCommand(CharacterReceiver characterReceiver) {
        this.characterReceiver = characterReceiver;
    }

    @Override
    public void execute() {
        characterReceiver.moveDown();
    }
}
