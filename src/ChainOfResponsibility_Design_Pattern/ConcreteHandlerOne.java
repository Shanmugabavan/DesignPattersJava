package ChainOfResponsibility_Design_Pattern;

public class ConcreteHandlerOne extends Handler {
    protected boolean handleRequestImpl(Request request) {
        if (request.getValue() < 0) {
            System.out.println("Negative values are handled by ConcreteHandlerOne:");
            System.out.println("\tConcreteHandlerOne.HandleRequest : " +
                    request.getDescription() + request.getValue());
            return true;
        } else {
            return false;
        }
    }
}
