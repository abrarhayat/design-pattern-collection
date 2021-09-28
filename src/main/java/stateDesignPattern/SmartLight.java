package stateDesignPattern;

public class SmartLight {
    private State currentLightState;
    private final State lightOn = new LightOnState();
    private final State lightOff = new LightOffState();

    public SmartLight() {
        this.currentLightState = lightOff;
    }

    public State getLightOnState() {
        return lightOn;
    }

    public State getLightOffState() {
        return lightOff;
    }

    public State setState(State state) {
        this.currentLightState = state;
        return currentLightState;
    }

    public void turnLightOn() {
        currentLightState.switchLightOn(this);
    }

    public void turnLightOff() {
        currentLightState.switchLightOff(this);
    }
}
