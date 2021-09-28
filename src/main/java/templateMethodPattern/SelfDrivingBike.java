package templateMethodPattern;

public class SelfDrivingBike extends SelfDrivingVehicle {
    @Override
    protected void accelerate() {
        /*
         * Bike Specific Acceleration
         * */
        System.out.println("Bike Specific Acceleration");
    }

    @Override
    protected void brake() {
        /*
         * Bike Specific Brake
         * */
        System.out.println("Bike Specific Brake");
    }

    @Override
    protected void start() {
        /*
         * Bike Specific Start
         * */
        System.out.println("Bike Specific Brake");
    }
}
