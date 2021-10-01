package observerDesignPattern.YouTube;

import observerDesignPattern.Observer;
import observerDesignPattern.Subject;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    String channelName;
    String status;

    public Channel(String channelName, String status) {
        this.channelName = channelName;
        this.status = status;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this.status));
    }

    public String getChannelName() {
        return channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
