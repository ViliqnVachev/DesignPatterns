package structural.adapter.models.adapter;

import structural.adapter.models.EnemyRobot;
import structural.adapter.target.IEnemyAttacker;

public class EnemyRobotAdapter implements IEnemyAttacker {

    private EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        robot.reactToHuman(driverName);
    }
}
