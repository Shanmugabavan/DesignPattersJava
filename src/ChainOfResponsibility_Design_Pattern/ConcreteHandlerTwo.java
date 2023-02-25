package ChainOfResponsibility_Design_Pattern;

public class ConcreteHandlerTwo extends Handler {
    protected boolean handleRequestImpl(Request request) {
        if (request.getValue() > 0) {
            System.out.println("Positive values are handled by ConcreteHandlerTwo:");
            System.out.println("\tConcreteHandlerTwo.HandleRequest : " +
                    request.getDescription()
                    + request.getValue());
            return true;
        } else {
            return false;
        }
    }
}
