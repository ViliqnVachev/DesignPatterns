package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ATC implements IMediator {
    private List<AirCraft> airCraftList;

    public ATC() {
        this.airCraftList = new ArrayList<>();
    }

    @Override
    public void addAirCraft(AirCraft airCraft) {
        this.airCraftList.add(airCraft);
    }

    @Override
    public void sendMessage(String msg, AirCraft airCraft) {
        for (AirCraft craft : airCraftList) {
            if(!craft.name.equals(airCraft.name)){
                craft.receiveMessage(msg);
            }
        }
    }
}
