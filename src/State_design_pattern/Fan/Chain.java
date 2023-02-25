package State_design_pattern.Fan;

class Chain {
    private State state;
    Chain(State initialState){
        state=initialState;
    }
    void changeState(Chain this){
        state.goNext(this);
        state.printState_string();
    }
    void setState(State state){
        this.state=state;
    }
}
