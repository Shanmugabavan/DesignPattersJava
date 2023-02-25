package ChainOfResponsibility_Design_Pattern;

public class Handler_3 extends ConcreteHandlerThree {
    private Handler next;



    public void setNext(Handler handler) {
        this.next=handler;
    }
}
