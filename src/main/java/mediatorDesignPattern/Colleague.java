package mediatorDesignPattern;

public abstract class Colleague {
    protected Mediator mediator;
    protected String message;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    protected abstract void getMessageFromMediator(String message);
    protected abstract void notifyMediator();
}
