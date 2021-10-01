package mediatorDesignPattern.homeAutomation;

import mediatorDesignPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeAutomationMediator extends Mediator {
    private final List<String> unreadMessages = new ArrayList<>();

    public static Mediator getInstance() {
        if (mediator == null) {
            mediator = new HomeAutomationMediator();
        }
        return mediator;
    }

    public void passMessage(String message) {
        unreadMessages.add(message);
    }

    public void ringAlarm(Phone phone) {
        phone.getMessageFromMediator("Ring Alarm");
    }

    public void openDoor(AutomatedDoor door) {
        door.getMessageFromMediator("Open Door");
    }

    @Override
    public void checkMessages() {
        /*
        * Will be run on a schedule
        * */
        System.out.println("Unread Messages:");
        unreadMessages.forEach(System.out::println);
        unreadMessages.clear();
    }
}
