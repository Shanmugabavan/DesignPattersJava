package State_design_pattern.Fan;

import javax.print.attribute.standard.Media;

public class Medium extends State {
    private static State instance;
    private Medium(){

    }

    public static State getInstance(){
        if (instance==null){
            synchronized (Medium.class){
                if (instance==null){
                    instance=new Medium();
                }
            }
        }
        return instance;
    }
    @Override
    public void goNext(Chain chain) {
        chain.setState(High.getInstance());
    }

    @Override
    public void printState_string() {
        System.out.println("Medium");
    }
}
