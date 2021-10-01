package observerDesignPattern.AuctionBidder;

import observerDesignPattern.Observer;

public class Bidder implements Observer {
    @Override
    public void update(String update) {
        /*
         * Update info about Auction
         * */
        System.out.println("Updated info about auction for observer " + this.hashCode());
        System.out.println("Update is " + update);
    }
}
