package behavioral.command.models;

public class Sonic implements CharacterReceiver{
    @Override
    public void moveUp() {
        System.out.println("Sonic moving forward");
    }

    @Override
    public void moveDown() {
        System.out.println("Sonic moving backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("Sonic moving left");
    }

    @Override
    public void moveRight() {
        System.out.println("Sonic moving right");
    }
}
