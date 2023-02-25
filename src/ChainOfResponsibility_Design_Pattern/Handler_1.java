package ChainOfResponsibility_Design_Pattern;

public class Handler_1 extends ConcreteHandlerOne {
    private Handler next;



    public void setNext(Handler handler) {
        this.next=handler;
    }
}
