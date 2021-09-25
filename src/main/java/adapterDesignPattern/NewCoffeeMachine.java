package adapterDesignPattern;

public class NewCoffeeMachine {
    private final CoffeeMachineInterface coffeeMachineInterface;

    public NewCoffeeMachine(CoffeeMachineInterface coffeeMachineInterface) {
        this.coffeeMachineInterface = coffeeMachineInterface;
    }

    public void useOldCoffeeMachine(String oldCoffeeType) {
        if (oldCoffeeType.equals("TypeA")) {
            coffeeMachineInterface.chooseFirstSelection();
            return;
        }
        coffeeMachineInterface.chooseSecondSelection();
    }
}
