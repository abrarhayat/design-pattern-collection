import org.testng.annotations.Test;
import templateMethodPattern.SelfDrivingBike;
import templateMethodPattern.SelfDrivingCar;

public class TemplateMethodTest {
    @Test
    public void testTemplateMethod() {
        SelfDrivingCar selfDrivingCar = new SelfDrivingCar();
        selfDrivingCar.goToDestination();

        SelfDrivingBike selfDrivingBike = new SelfDrivingBike();
        selfDrivingBike.goToDestination();
    }
}
