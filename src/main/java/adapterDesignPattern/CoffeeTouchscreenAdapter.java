package adapterDesignPattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private final OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldVendingMachine) {
        this.oldVendingMachine = oldVendingMachine;
    }

    public void chooseFirstSelection() {
        oldVendingMachine.selectA();
    }

    public void chooseSecondSelection() {
        oldVendingMachine.selectB();
    }

}