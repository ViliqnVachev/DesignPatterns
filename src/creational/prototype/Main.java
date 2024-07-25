package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("VW", 190));
        vehicles.add(new Bus(55));

        List<Vehicle> copies = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copies.add(vehicle.clone());
        }

        for (int i = 0; i < copies.size(); i++) {
            System.out.println("Original" + vehicles.get(i));
            System.out.println("Copies" + copies.get(i));
            System.out.println();
        }
    }
}
