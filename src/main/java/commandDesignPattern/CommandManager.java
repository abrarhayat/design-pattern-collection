package commandDesignPattern;

public class CommandManager {
    private static CommandManager commandManager;

    public static CommandManager getInstance() {
        if (commandManager == null) {
            commandManager = new CommandManager();
        }
        return commandManager;
    }

    public void invokeCommand(Command command) {
        System.out.println("Executing " + command.commandName);
        command.execute();
    }

    public void reverseCommand(Command command) {
        System.out.println("Reversing " + command.commandName);
        if (command.isReversible()) {
            command.revert();
            return;
        }
        System.out.println("Command is irreversible");
    }
}
