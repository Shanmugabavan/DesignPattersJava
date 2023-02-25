package Strategy_design_pattern.Robot;

public class DefensiveBehaviour implements IBehaviour {
    @Override
    public void moveCommand() {
        System.out.println("Defensive");
    }
}
