package mediatorDesignPattern;

public abstract class Mediator {
    protected static Mediator mediator;
    public abstract void checkMessages();
    public abstract void passMessage(String message);
}
