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

    protected abstract void unexecute();

    protected abstract boolean isReversible();
}
