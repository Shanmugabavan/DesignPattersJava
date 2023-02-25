package Mediator_Design_Pattern;

public abstract class User {
    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message,User user);
    public abstract String getName();
}
