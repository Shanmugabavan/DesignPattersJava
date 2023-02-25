package Strategy_design_pattern.Robot;

public class Robot {
    private IBehaviour iBehaviour;

    Robot(IBehaviour iBehaviour){
        this.iBehaviour=iBehaviour;
    }

    public void move(){
        iBehaviour.moveCommand();
    }
    public void changeMovement(IBehaviour iBehaviour){
        this.iBehaviour=iBehaviour;

    }
}
