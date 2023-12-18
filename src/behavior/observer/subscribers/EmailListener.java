package behavior.observer.subscribers;

import behavior.observer.subscribers.EventListeners;

public class EmailListener implements EventListeners {
    private String email;
    private String message;

    public EmailListener(String email, String message) {
        this.email = email;
        this.message = message;
    }


    @Override
    public void update(String fileName) {
        System.out.println(email + " " + String.format(message, fileName));

    }
}
