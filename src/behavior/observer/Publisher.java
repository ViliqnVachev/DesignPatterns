package behavior.observer;

import behavior.observer.subscribers.EventListeners;

public interface Publisher {

    void subscribe(String eventType, EventListeners event);


    void unsubscribe(String eventType, EventListeners event);

    void notifySubs(String eventType, String data);
}
