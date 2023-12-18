package behavior.observer.subscribers;

import behavior.observer.subscribers.EventListeners;

public class LoggingListener implements EventListeners {

    private String fileName;
    private String message;

    public LoggingListener(String fileName, String message) {
        this.fileName = fileName;
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        System.out.println(String.format(message, fileName));
    }
}
