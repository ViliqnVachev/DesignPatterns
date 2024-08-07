package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        IMediator mediator = new ATC();

        AirCraft boing = new AircraftImpl(mediator, "Boing");
        AirCraft helicopter = new AircraftImpl(mediator, "Helicopter");
        AirCraft jet = new AircraftImpl(mediator, "Jet");

        mediator.addAirCraft(boing);
        mediator.addAirCraft(helicopter);
        mediator.addAirCraft(jet);

        boing.sendMessage("Hello from me");
    }
}
