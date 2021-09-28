package templateMethodPattern;

public class SelfDrivingCar extends SelfDrivingVehicle {
    @Override
    protected void accelerate() {
        /*
         * Car Specific Acceleration
         * */
        System.out.println("Car Specific Acceleration");
    }

    @Override
    protected void brake() {
        /*
         * Car Specific Brake
         * */
        System.out.println("Car Specific Brake");
    }

    @Override
    protected void start() {
        /*
         * Car Specific Start
         * */
        System.out.println("Car Specific Start");
    }
}
