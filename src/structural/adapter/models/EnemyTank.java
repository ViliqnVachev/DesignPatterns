package structural.adapter.models;

import java.util.Random;
import structural.adapter.target.IEnemyAttacker;

public class EnemyTank implements IEnemyAttacker {

    private Random random = new Random();

    @Override
    public void fireWeapon() {

        System.out.println("Enemy Tank does " + random.nextInt(10) + " damage");

    }

    @Override
    public void driveForward() {
        System.out.println("Enemy Tank moves " + random.nextInt(10) + " spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }
}
