package Command_design_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Switch switch1=new Switch();
        Light light=new Light();

        Command switchOffCommand=new SwitchOffCommand(light);
        Command switchOnCommand=new SwitchOnCommand(light);

        switch1.addCommand("Off",switchOffCommand);
        switch1.addCommand("On",switchOnCommand);

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        while (!input.equals("-1")){
            if (input.equals("1")){
                switch1.commandExecute("On");

            }else if (input.equals("2")){
                switch1.commandExecute("Off");
            }
            input=scanner.nextLine();
        }

    }
}
