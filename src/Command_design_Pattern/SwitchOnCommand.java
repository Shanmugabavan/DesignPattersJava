package Command_design_Pattern;

public class SwitchOnCommand implements Command {
    private Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
