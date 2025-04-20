
// Example of creating an order by an user
// It will involve multiple internal components
// And Client will use the facade to work with internal subsystems

public class Main {

    public static void main(String [] args) {

        OrderFacade orderFacObj = new OrderFacade();

        // 1. Initate Order
        orderFacObj.createOrder();

        // 2. Get Order status
        String orderStatus = orderFacObj.getStatusOfOrder();
        System.out.println(orderStatus);

        // 3, Get Invoide
        orderFacObj.getInvoice();

    }

}
