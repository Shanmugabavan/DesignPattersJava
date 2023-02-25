package Mediator_Design_Pattern;

public abstract class Mediator {
    public abstract void sendMessage(String message,User user);
    public abstract void addUser(User user);
}
