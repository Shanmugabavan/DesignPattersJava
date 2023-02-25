package Memento_Design_Pattern;

import java.util.ArrayList;
import java.util.Scanner;

public class CareTaker {
    public static void main(String[] args) {
        ArrayList<Memento> memento_list=new ArrayList<>();
        Originator originator=new Originator();

        Scanner scanner=new Scanner(System.in);
        String decider=scanner.nextLine();
        int counter=0;
        originator.setState(String.valueOf(counter));


        while (!(decider.equals("-1"))){
            if (decider.equals("1")){
                memento_list.add(originator.setStateToMemento());
                String newState=String.valueOf(Integer.parseInt(originator.getState())+1);
                System.out.println(newState);
                originator.setState(newState);

            }else if(decider.equals("0")){
                originator.restoreFromMemento(memento_list.get(memento_list.size()-1));
                memento_list.remove(memento_list.size()-1);
                System.out.println(originator.getState());
            }
            decider=scanner.nextLine();
        }

    }
}
