

public abstract class HandlerAbstract {
    HandlerAbstract nextHandlerObj = null;
    public abstract boolean handleRequest(int data);

    HandlerAbstract(HandlerAbstract nextObj) {
        this.nextHandlerObj = nextObj;
    }
}