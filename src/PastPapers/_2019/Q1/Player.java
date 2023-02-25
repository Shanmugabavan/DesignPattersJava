package PastPapers._2019.Q1;

public class Player {
    private String name;
    public Player(String name) {
        this.name=name;
    }

    public void notifyFunction(){
        System.out.println(this.name+": Notified");
    }
}
