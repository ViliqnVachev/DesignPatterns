package creational.prototype;

public class Car extends Vehicle {

    final String model;
    final int hp;

    public Car(String model, int hp) {
        this.model = model;
        this.hp = hp;
    }

    private Car(Car car) {
        this.model = car.model;
        this.hp = car.hp;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
