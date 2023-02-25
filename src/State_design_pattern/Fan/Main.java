package State_design_pattern.Fan;

import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        State off=Off.getInstance();
        State high=High.getInstance();
        State low=Low.getInstance();
        State medium= Medium.getInstance();
        Chain chain=new Chain(off);

        Scanner scanner=new Scanner(System.in);
        while (true){
            String number=scanner.nextLine();
            int number_=Integer.parseInt(number);
            if (number_==1){
                chain.changeState();
            }else{
                break;
            }
        }
    }
}
