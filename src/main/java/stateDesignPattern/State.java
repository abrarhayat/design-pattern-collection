package stateDesignPattern;

public interface State {
    void switchLightOn(SmartLight light);
    void switchLightOff(SmartLight light);
}
