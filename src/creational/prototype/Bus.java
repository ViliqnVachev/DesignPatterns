package creational.prototype;

public class Bus extends Vehicle {
    final int seats;

    public Bus(int seats) {
        this.seats = seats;
    }

    private Bus(Bus bus) {
        this.seats = bus.seats;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
