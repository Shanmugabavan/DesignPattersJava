package Command_design_Pattern;

import java.util.HashMap;

public class Switch {
    private HashMap<String,Command> commandHashMap;

    public Switch() {
        commandHashMap=new HashMap<>();
    }

    public void addCommand(String commandName,Command command){
        commandHashMap.put(commandName,command);
    }

    public void commandExecute(String commandName){
        Command command=commandHashMap.get(commandName);
        command.execute();
    }
}
