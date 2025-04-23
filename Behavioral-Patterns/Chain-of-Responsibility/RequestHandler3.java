public class RequestHandler3 extends HandlerAbstract {


    RequestHandler3(HandlerAbstract nextObj) {
        super(nextObj);
    }

    @Override
    public boolean handleRequest(int data) {
        if(data == 3) {
            System.out.println("Request handled by handler3");
            return true;
        }
        else {
            if(this.nextHandlerObj != null) {
                System.out.println("Request passed on by handler3");
                return nextHandlerObj.handleRequest(data);
            }
            else {
                System.out.println("No next handler found !");
                return false;
            }
        }
    }

}
