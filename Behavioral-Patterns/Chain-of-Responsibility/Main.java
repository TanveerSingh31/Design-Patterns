public class Main {

    public static void main (String [] args) {

        // handler1 -> handler2 -> handler3
        HandlerAbstract requestHandlerObj = new RequestHandler1(
                new RequestHandler2(
                        new RequestHandler3(null)
                )
        );

        System.out.println("-------- request 1 -----------");
        requestHandlerObj.handleRequest(1);

        System.out.println("-------- request 2 -----------");
        requestHandlerObj.handleRequest(2);

        System.out.println("-------- request 3 -----------");
        requestHandlerObj.handleRequest(3);

        System.out.println("-------- Incorrect Request -----------");
        requestHandlerObj.handleRequest(100); // cannot find appropriate handler to find the request.

    }





}
