package stateDesignPattern;

public class LightOffState implements State {
    @Override
    public void switchLightOn(SmartLight light) {
        light.setState(light.getLightOnState());
        System.out.println("Turning Light On");
    }

    @Override
    public void switchLightOff(SmartLight light) {
        System.out.println("Light is already on!");
    }
}
