package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    public void registerObserver(Observer observer);

    public void unregisterObserver(Observer observer);

    public void notifyObservers();
}
