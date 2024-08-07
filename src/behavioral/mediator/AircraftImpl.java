package behavioral.mediator;

public class AircraftImpl extends AirCraft {

    public AircraftImpl(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(this.name + ": Sending a message " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.name + ": Receiving a message");
    }
}
