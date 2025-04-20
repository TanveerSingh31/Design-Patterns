import Subsystems.Invoice;
import Subsystems.Payment;
import Subsystems.Product;
import Subsystems.User;

public class OrderFacade {

    private Product productObj;
    private User userObj;
    private Payment paymentObj;
    private Invoice invoiceObj;

    OrderFacade() {
        this.productObj = new Product();
        this.userObj = new User();
        this.paymentObj = new Payment();
        this.invoiceObj = new Invoice();
    }



    // create order
    public void createOrder() {

        userObj.checkIfUserExists();
        productObj.checkIfProductExists();
        productObj.addProduct();
        paymentObj.initiatePayment();
        invoiceObj.generateInvoice();
        System.out.println("-------- Order created ----------");
    }


    // get status of order
    public String getStatusOfOrder(){
        userObj.checkIfUserExists();
        System.out.println("-------- Order status checked ----------");
        return productObj.getStatus();

    }


    // get invoice
    public void getInvoice() {
        productObj.checkIfProductExists();
        invoiceObj.generateInvoice();
        System.out.println("-------- Invoice Generated ----------");
    }
}
