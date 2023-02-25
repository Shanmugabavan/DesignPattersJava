package Strategy_design_pattern.Robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robot robot=new Robot(new AggressiveBehaviour());

        Scanner scanner=new Scanner(System.in);

        try{
            while (true){
                String input=scanner.nextLine();

                if (input.equals("1")){
                    robot.changeMovement(new AggressiveBehaviour());
                }else if (input.equals("2")){
                    robot.changeMovement(new DefensiveBehaviour());
                }else if (input.equals("3")){
                    robot.changeMovement(new NormalBehaviour());
                }else if (input.equals("0")){
                    robot.move();
                }
            }
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
