package observerDesignPattern.AuctionBidder;

import observerDesignPattern.Observer;
import observerDesignPattern.Subject;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    String state;

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        this.state = newState;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this.state));
    }

    /*
     * Other Auction Specific Tasks
     * */
}
