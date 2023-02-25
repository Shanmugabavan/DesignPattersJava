package Observer_design_Pattern;

public class Observer {
    String name;
    Observer(String name){
        this.name=name;
    }

    public void update(){
        System.out.println(name+": I got update");
    }
}
