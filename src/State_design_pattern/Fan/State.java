package State_design_pattern.Fan;

public abstract class State {
    public abstract void goNext(Chain chain);
    public abstract void printState_string();
}
