package behavior.observer;

import behavior.observer.subscribers.EventListeners;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager implements Publisher {

    private Map<String, List<EventListeners>> listeners;

    public EventManager() {
        listeners = new HashMap<>();
    }

    @Override
    public void subscribe(String eventType, EventListeners event) {
        this.listeners.putIfAbsent(eventType, new ArrayList<>());
        this.listeners.get(eventType).add(event);
    }

    @Override
    public void unsubscribe(String eventType, EventListeners event) {
        this.listeners.get(eventType).remove(event);
    }

    @Override
    public void notifySubs(String eventType, String data) {
        for (EventListeners event : listeners.get(eventType)) {
            event.update(data);
        }
    }
}
