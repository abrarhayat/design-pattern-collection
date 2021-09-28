package templateMethodPattern;

public abstract class SelfDrivingVehicle {
    public final void goToDestination() {
        calculateDestinationCoordinates();
        start();
        accelerate();
        brake();
    }

    private void calculateDestinationCoordinates() {
        /*
        * Perform calculation
        * */
    }

    protected abstract void accelerate();

    protected abstract void brake();

    protected abstract void start();
}
