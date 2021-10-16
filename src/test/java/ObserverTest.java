import observerDesignPattern.AuctionBidder.Auction;
import observerDesignPattern.AuctionBidder.Bidder;
import observerDesignPattern.YouTube.Channel;
import observerDesignPattern.YouTube.Follower;
import org.testng.annotations.Test;

public class ObserverTest {
    @Test
    public void TestObserver() {
        Auction auction = new Auction();

        auction.registerObserver(new Bidder());
        auction.registerObserver(new Bidder());
        Bidder shortTermBidder = new Bidder();
        auction.registerObserver(shortTermBidder);

        System.out.println(auction.getState());
        auction.setState("No new bids!");

        auction.notifyObservers();

        auction.setState("New Bid!");

        auction.unregisterObserver(shortTermBidder);

        auction.notifyObservers();

        Channel channel = new Channel("Abrar's Channel", "Active");
        System.out.println(channel.getChannelName());
        channel.setChannelName("Abrar's Channel!");

        channel.registerObserver(new Follower("Test1"));
        channel.registerObserver(new Follower("Test2"));

        Follower tempFollower = new Follower("Test3");
        channel.registerObserver(tempFollower);

        channel.notifyObservers();

        channel.setStatus("No New Videos!");
        System.out.println(channel.getStatus());

        channel.unregisterObserver(tempFollower);

        channel.setStatus("New Video Out!");

        channel.notifyObservers();
    }
}
