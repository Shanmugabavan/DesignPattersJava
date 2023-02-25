package ChainOfResponsibility_Design_Pattern;

public abstract class Handler {
        protected Handler m_successor;
        public void setSuccessor(Handler successor) {
            m_successor = successor;
        }

        protected abstract boolean handleRequestImpl(Request request);

        public final void handleRequest(Request request) {
            boolean handledByThisNode = this.handleRequestImpl(request);
            if (m_successor != null && !handledByThisNode)
                {
                 m_successor.handleRequest(request); }
        }

}


