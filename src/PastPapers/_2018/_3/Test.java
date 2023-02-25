package PastPapers._2018._3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true) {
            WikiPageVersion.getVersion(Integer.parseInt(scanner.nextLine()));
        }
    }
}
