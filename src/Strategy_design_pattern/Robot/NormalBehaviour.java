package Strategy_design_pattern.Robot;

public class NormalBehaviour implements IBehaviour {
    @Override
    public void moveCommand() {
        System.out.println("Normal");
    }
}
