package structural.adapter.models;

import java.util.Random;

public class EnemyRobot {

    private Random random = new Random();

    public void smashWithHands() {
        System.out.println("Enemy robot causes " + random.nextInt(10) + " damages whit its hands");
    }

    public void walkForward() {
        System.out.println("Enemy robot walks " + random.nextInt(10) + " spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy robot tramps on " + driverName);
    }
}
