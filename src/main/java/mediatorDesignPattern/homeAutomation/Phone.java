package mediatorDesignPattern.homeAutomation;

import mediatorDesignPattern.Colleague;
import mediatorDesignPattern.Mediator;

public class Phone extends Colleague {

    public Phone(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void getMessageFromMediator(String message) {
        if(message.equals("Ring Alarm")){
            ringAlarm();
            notifyMediator();
        }
    }

    @Override
    protected void notifyMediator() {
        System.out.println("Notifying Mediator From " + this.getClass().getName());
        mediator.passMessage(message);
    }

    private void ringAlarm() {
        System.out.println("Alarm is ringing");
        message = "Alarm Rung";
    }
}
