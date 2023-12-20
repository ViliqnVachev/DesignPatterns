package behavioral.observer;

import behavioral.observer.subscribers.EventListeners;

public interface Publisher {

    void subscribe(String eventType, EventListeners event);


    void unsubscribe(String eventType, EventListeners event);

    void notifySubs(String eventType, String data);
}
