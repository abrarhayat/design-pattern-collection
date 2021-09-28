package stateDesignPattern;

public class LightOnState implements State {
    @Override
    public void switchLightOn(SmartLight light) {
        System.out.println("Light is already on!");
    }

    @Override
    public void switchLightOff(SmartLight light) {
        System.out.println("Turning Light Off");
        light.setState(light.getLightOffState());
    }
}
