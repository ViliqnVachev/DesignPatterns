package behavior.observer;

import behavior.observer.subscribers.EmailListener;
import behavior.observer.subscribers.EventListeners;
import behavior.observer.subscribers.LoggingListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        EventListeners logger = new LoggingListener("test", "Someone has opened the file: %s");
        editor.publisher.subscribe("open", logger);

        EventListeners emailAlerts = new EmailListener("asd@abv.bg", "Someone has changed the file: %s");

        editor.publisher.subscribe("save", emailAlerts);
        editor.publisher.subscribe("open", emailAlerts);

        editor.openFile("test.txt");
        editor.saveFile();
    }
}
