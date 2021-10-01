package mediatorDesignPattern.homeAutomation;

import mediatorDesignPattern.Colleague;
import mediatorDesignPattern.Mediator;

public class AutomatedDoor extends Colleague {

    public AutomatedDoor(Mediator mediator) {
        super(mediator);
    }

    @Override
    protected void notifyMediator() {
        System.out.println("Notifying Mediator From " + this.getClass().getName());
        mediator.passMessage(message);
    }

    @Override
    public void getMessageFromMediator(String message) {
        if (message.equals("Open Door")) {
            openDoor();
            notifyMediator();
        }
    }

    private void openDoor() {
        System.out.println("Opening the door");
        message = "Door Opened";
    }
}
