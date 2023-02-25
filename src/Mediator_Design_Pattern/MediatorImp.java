package Mediator_Design_Pattern;

import java.util.ArrayList;

public class MediatorImp extends Mediator {
    private ArrayList<User> users_list;

    MediatorImp(){
        users_list=new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User user1: users_list){
            if (user!=user1){
                user1.receiveMessage(message,user);
            }
        }

    }

    @Override
    public void addUser(User user) {
        users_list.add(user);
    }
}
