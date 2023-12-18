package behavior.observer;

public class Editor {

    public Publisher publisher;
    private String fileName;

    public Editor() {
        this.publisher = new EventManager();
    }

    public void openFile(String fileName) {
        this.fileName = fileName;
        publisher.notifySubs("open", fileName);
    }

    public void saveFile() {
        publisher.notifySubs("save", fileName);
    }

}
