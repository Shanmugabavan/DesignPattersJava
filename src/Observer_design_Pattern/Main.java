package Observer_design_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Observable observable=new Observable();

        Observer observer1=new Observer("Shanmu");
        Observer observer2=new Observer("Coder");
        Observer observer3=new Observer("Nirun");

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        while(!(input.equals("-1"))){
            if (input.equals("1")){
                observable.changeState();
            }else if (input.equals("2")){
                observable.addObserver(new Observer("unknown"));
            }
            input=scanner.nextLine();
        }

    }
}
