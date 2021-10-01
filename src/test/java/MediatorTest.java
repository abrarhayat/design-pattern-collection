import mediatorDesignPattern.Mediator;
import mediatorDesignPattern.homeAutomation.AutomatedDoor;
import mediatorDesignPattern.homeAutomation.HomeAutomationMediator;
import mediatorDesignPattern.homeAutomation.Phone;
import org.testng.annotations.Test;

public class MediatorTest {

    @Test
    public void testMediator() {
        HomeAutomationMediator homeAutomationMediator = (HomeAutomationMediator) HomeAutomationMediator.getInstance();
        Phone phone = new Phone(homeAutomationMediator);
        AutomatedDoor automatedDoor = new AutomatedDoor(homeAutomationMediator);

        homeAutomationMediator.ringAlarm(phone);
        homeAutomationMediator.openDoor(automatedDoor);

        homeAutomationMediator.checkMessages();
    }
}
