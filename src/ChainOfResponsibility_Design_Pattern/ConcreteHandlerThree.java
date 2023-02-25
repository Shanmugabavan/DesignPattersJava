package ChainOfResponsibility_Design_Pattern;

public class ConcreteHandlerThree extends Handler {
    protected boolean handleRequestImpl(Request request) {
        if (request.getValue() == 0) {
            System.out.println("Zero values are handled by ConcreteHandlerThree:");
            System.out.println("\tConcreteHandlerThree.HandleRequest : " +
                    request.getDescription() + request.getValue());
            return true;
        } else {
            return false;
        }
    }
}
