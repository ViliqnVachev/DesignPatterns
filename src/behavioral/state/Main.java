package behavioral.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);
        System.out.println(machine);
        machine.insertMoney();
        System.out.println(machine);
        System.out.println("=================");
        machine.select();
        System.out.println(machine);
        System.out.println("=================");
        machine.dispense();
        System.out.println(machine);
        System.out.println("=================");
    }
}
