package behavioral.command.models;

public class Mario implements CharacterReceiver{
    private String name;

    public Mario(String name) {
        this.name = name;
    }

    @Override
    public void moveUp() {
        System.out.println("Mario moving forward");
    }

    @Override
    public void moveDown() {
        System.out.println("Mario moving backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("Mario moving left");
    }

    @Override
    public void moveRight() {
        System.out.println("Mario moving right");
    }
}
