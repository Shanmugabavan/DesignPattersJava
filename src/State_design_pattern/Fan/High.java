package State_design_pattern.Fan;

public class High extends State {
    private static State instance;
    private High(){

    }
    public static State getInstance(){
        if (instance==null){
            synchronized (High.class){
                if (instance==null){
                    instance=new High();
                }
            }
        }
        return instance;
    }
    @Override
    public void goNext(Chain chain) {
        chain.setState(Off.getInstance());
    }

    @Override
    public void printState_string() {
        System.out.println("High");
    }
}
