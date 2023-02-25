package Observer_design_Pattern;

import java.util.ArrayList;

public class Observable {
    private int state;
    private ArrayList<Observer> observers_list;
    private static int count=0;

    Observable(){
        observers_list=new ArrayList<>();
    }

    public void addObserver (Observer observer){
        observers_list.add(observer);
    }

    public void changeState(){
        count+=1;
        this.notifyObservers();
    }

    public void notifyObservers(){
        for (Observer observer: observers_list){
            observer.update();
        }
    }
}
