package Strategy_design_pattern.Robot;

public class AggressiveBehaviour implements IBehaviour {
    @Override
    public void moveCommand() {
        System.out.println("Aggressive");
    }
}
