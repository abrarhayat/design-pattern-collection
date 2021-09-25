import adapterDesignPattern.CoffeeTouchscreenAdapter;
import adapterDesignPattern.NewCoffeeMachine;
import adapterDesignPattern.OldCoffeeMachine;

public class CoffeeTest {
    public static void main(String[] arg) {
        NewCoffeeMachine newCoffeeMachine = new NewCoffeeMachine(new CoffeeTouchscreenAdapter(new OldCoffeeMachine()));
        newCoffeeMachine.useOldCoffeeMachine("TypeA");
    }
}
