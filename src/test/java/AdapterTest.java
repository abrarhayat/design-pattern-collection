import adapterDesignPattern.CoffeeTouchscreenAdapter;
import adapterDesignPattern.NewCoffeeMachine;
import adapterDesignPattern.OldCoffeeMachine;
import org.testng.annotations.Test;

public class AdapterTest {
    @Test
    public void testAdapterDesign() {
        NewCoffeeMachine newCoffeeMachine = new NewCoffeeMachine(new CoffeeTouchscreenAdapter(new OldCoffeeMachine()));
        newCoffeeMachine.useOldCoffeeMachine("TypeA");
    }
}
