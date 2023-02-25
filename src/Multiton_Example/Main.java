package Multiton_Example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String id=scanner.nextLine();

        while (!id.equals("-1")){
            Multiton.getEmployee(id);
            id=scanner.nextLine();
        }


    }
}
