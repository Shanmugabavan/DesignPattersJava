package Mediator_Design_Pattern;

public class UserImp extends User {
    private String name;
    private Mediator mediator;

    public UserImp(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message,User user) {
        System.out.println(this.getName()+": "+message+" From "+user.getName());
    }
}
