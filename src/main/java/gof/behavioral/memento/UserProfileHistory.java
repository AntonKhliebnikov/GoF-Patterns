package gof.behavioral.memento;

import java.util.Stack;

public class UserProfileHistory {

    private final Stack<UserProfileSettings.UserProfileMemento> history = new Stack<>();

    public void save(UserProfileSettings.UserProfileMemento memento) {

        history.push(memento);
    }

    public UserProfileSettings.UserProfileMemento restore() {
        return history.pop();
    }
}