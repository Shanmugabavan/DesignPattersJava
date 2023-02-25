package State_design_pattern.Fan;

public class Off extends State {
    private static State instance;
    private Off(){

    }

    public static State getInstance(){
        if (instance==null){
            synchronized (Off.class){
                if (instance==null){
                    instance=new Off();
                }
            }
        }
        return instance;
    }
    @Override
    public void goNext(Chain chain) {
        chain.setState(Low.getInstance());
    }

    @Override
    public void printState_string() {
        System.out.println("Off");
    }
}
