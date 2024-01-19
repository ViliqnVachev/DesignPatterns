package structural.adapter;

import structural.adapter.models.EnemyRobot;
import structural.adapter.models.EnemyTank;
import structural.adapter.models.adapter.EnemyRobotAdapter;
import structural.adapter.target.IEnemyAttacker;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Tank =====\n");

        IEnemyAttacker tank = new EnemyTank();
        tank.assignDriver("Vil");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println("===== Robot =====\n");

        EnemyRobot robot = new EnemyRobot();
        robot.reactToHuman("Billy");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("===== Adapter Robot =====\n");
        IEnemyAttacker adapter = new EnemyRobotAdapter(robot);
        adapter.assignDriver("Adapter Robot");
        adapter.driveForward();
        adapter.fireWeapon();
    }
}
