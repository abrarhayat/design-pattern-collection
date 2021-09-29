package commandDesignPattern;

public class WriteCommand extends Command {
    public WriteCommand(String commandName) {
        super(commandName);
    }

    @Override
    protected void execute() {
        System.out.println("Writing to the DB");
    }

    @Override
    protected void unexecute() {
        System.out.println("Deleting From DB");
    }

    @Override
    protected boolean isReversible() {
        return true;
    }
}
