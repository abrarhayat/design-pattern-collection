import commandDesignPattern.CommandManager;
import commandDesignPattern.SearchCommand;
import commandDesignPattern.WriteCommand;
import org.testng.annotations.Test;

public class CommandTest {
    @Test
    public void testCommand() {
        CommandManager commandManager = CommandManager.getInstance();
        SearchCommand searchCommand1 = new SearchCommand("Search Command 1");
        WriteCommand writeCommand = new WriteCommand("Write Command 1");
        SearchCommand searchCommand2 = new SearchCommand("Search Command 2");

        commandManager.invokeCommand(searchCommand1);
        commandManager.invokeCommand(writeCommand);
        commandManager.invokeCommand(searchCommand2);

        commandManager.reverseCommand(writeCommand);
        commandManager.reverseCommand(searchCommand2);
    }
}
