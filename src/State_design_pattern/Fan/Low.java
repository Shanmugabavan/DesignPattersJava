package State_design_pattern.Fan;

import javax.print.attribute.standard.Media;

public class Low extends State {
    private static State instance;
    private Low(){

    }

    public static State getInstance(){
        if (instance==null){
            synchronized (Low.class){
                if (instance==null){
                    instance=new Low();
                }
            }
        }
        return instance;
    }
    @Override
    public void goNext(Chain chain) { ;
        chain.setState(Medium.getInstance());
    }

    @Override
    public void printState_string() {
        System.out.println("Low");
    }
}
