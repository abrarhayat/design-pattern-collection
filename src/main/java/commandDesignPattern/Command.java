package commandDesignPattern;

public abstract class Command {
    protected String commandName;

    public Command(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    protected abstract void execute();

    protected abstract void revert();

    protected abstract boolean isReversible();
}
