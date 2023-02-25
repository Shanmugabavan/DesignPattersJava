package Mediator_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Mediator mediator=new MediatorImp();
        User user1=new UserImp("Shanmu",mediator);
        User user2=new UserImp("Sarangan",mediator);
        User user3=new UserImp("Nirun",mediator);
        User user4=new UserImp("Paul",mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessage("Hi all");
    }
}
