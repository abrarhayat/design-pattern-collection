package commandDesignPattern;

public class SearchCommand extends Command {
    public SearchCommand(String commandName) {
        super(commandName);
    }

    @Override
    protected void execute() {
        System.out.println("Searching....");
    }

    @Override
    protected void unexecute() {
    }

    @Override
    protected boolean isReversible() {
        return false;
    }
}
