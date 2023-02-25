package Memento_Design_Pattern;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento setStateToMemento(){
        Memento memento=new Memento();
        memento.setState(this.state);
        return memento;
    }
    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
    }


}
