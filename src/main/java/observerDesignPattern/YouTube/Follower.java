package observerDesignPattern.YouTube;

import observerDesignPattern.Observer;

public class Follower implements Observer {
    String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String update) {
        System.out.println("Update for the follower " + this.hashCode() + " " + followerName);
        System.out.println("Update: " + update);
    }
}
