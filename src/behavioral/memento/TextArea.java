package behavioral.memento;

public class TextArea {
    String text;

    public void setText(String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }

    public static class Memento {
        private final String text;

        Memento(String textToSave) {
            this.text = textToSave;
        }

        private String getSavedText() {
            return this.text;
        }
    }
}
