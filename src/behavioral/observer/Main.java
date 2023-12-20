package behavioral.observer;

import behavioral.observer.subscribers.EmailListener;
import behavioral.observer.subscribers.EventListeners;
import behavioral.observer.subscribers.LoggingListener;

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
