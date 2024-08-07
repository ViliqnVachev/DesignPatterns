package behavioral.mediator;

public abstract class AirCraft {
    protected IMediator mediator;
    protected String name;

    public AirCraft(IMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String msg);

    public abstract void receiveMessage(String msg);
}
