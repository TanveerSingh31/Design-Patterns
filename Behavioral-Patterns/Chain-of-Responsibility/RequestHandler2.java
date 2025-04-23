public class RequestHandler2 extends HandlerAbstract {


    RequestHandler2(HandlerAbstract nextObj) {
        super(nextObj);
    }

    @Override
    public boolean handleRequest(int data) {
        if(data == 2) {
            System.out.println("Request handled by handler2");
            return true;
        }
        else {
            if(this.nextHandlerObj != null) {
                System.out.println("Request passed on by handler2");
                return nextHandlerObj.handleRequest(data);
            }
            else {
                System.out.println("No next handler found !");
                return false;
            }
        }
    }


}
