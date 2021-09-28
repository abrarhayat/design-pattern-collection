import org.testng.annotations.Test;
import stateDesignPattern.SmartLight;

public class StateTest {

    @Test
    public void testState() {
        SmartLight smartLight = new SmartLight();

        smartLight.turnLightOff();

        smartLight.turnLightOn();
        smartLight.turnLightOn();

        smartLight.turnLightOff();
    }
}
