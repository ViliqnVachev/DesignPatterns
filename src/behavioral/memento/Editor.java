package behavioral.memento;

import behavioral.memento.TextArea.Memento;
import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    private final Deque<Memento> stateHistory;
    private final TextArea textArea;

    public Editor() {
        stateHistory = new ArrayDeque<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.push(textArea.takeSnapshot());
        System.out.println(textArea.text + " was added..");
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
        System.out.println("Back to: " + textArea.text);
    }
}
