import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
    private Stack<Momento> history;

    CareTaker() {
        history = new Stack<>();
    }

    public void addMomento(Momento momento) {
        history.push(momento);
    }

    public Momento undo() {
        if (history.isEmpty()) return null;
        return history.pop();
    }
}
