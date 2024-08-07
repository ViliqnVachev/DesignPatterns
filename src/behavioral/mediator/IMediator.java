package behavioral.mediator;

public interface IMediator {
    void addAirCraft(AirCraft airCraft);

    void sendMessage(String msg, AirCraft airCraft);
}
