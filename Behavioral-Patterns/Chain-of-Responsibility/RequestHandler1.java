public class RequestHandler1 extends HandlerAbstract {

    RequestHandler1(HandlerAbstract nextObj) {
        super(nextObj);
    }

    @Override
    public boolean handleRequest(int data) {
        if(data == 1) {
            System.out.println("Request handled by handler1");
            return true;
        }
        else {
            if(this.nextHandlerObj != null) {
                System.out.println("Request passed on by handler1");
                return nextHandlerObj.handleRequest(data);
            }
            else {
                System.out.println("No next handler found !");
                return false;
            }
        }
    }
}
