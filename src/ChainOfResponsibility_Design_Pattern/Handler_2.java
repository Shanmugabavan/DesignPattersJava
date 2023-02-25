package ChainOfResponsibility_Design_Pattern;

public class Handler_2 extends ConcreteHandlerTwo {
    private Handler next;



    public void setNext(Handler handler) {
        this.next=handler;
    }
}
