package behavioral.memento;

public class Mai {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("A");
        editor.write("B");
        editor.write("C");

        editor.undo();
        editor.undo();
    }
}
