package Command_design_Pattern;

public class Light {
    private boolean islight;

    public void switchOn(){
        if (!islight){
            islight=true;
            System.out.println("Light On Succefully");
        }else{
            System.out.println("Already on");
        }
    }
    public void switchOff(){
        if (islight){
            islight=false;
            System.out.println("Light Off Succefully");
        }else{
            System.out.println("Already off");
        }
    }
}
