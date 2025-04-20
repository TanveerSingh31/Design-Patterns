import java.util.ArrayList;

// Composite class , contains List of child objects inside it.
public class BoxComposite implements Order  {

    private int orderId;
    private ArrayList<Order> productList; // Contains list of children (products) that are inside this order

    BoxComposite(int orderId) {
        this.orderId = orderId;
        this.productList = new ArrayList<Order>();
    }


    // Add child (product) into childrenList
    public void addProductToOrder(Order productObj) {
        productList.add(productObj);
    }


    // Remove child (product) from childrenList
    public void removeProductFromOrder(Order productObj){
        boolean result = productList.remove(productObj);
        System.out.println("element deleted ? " + result);
    }


    // Get price of complete order -> sum of price of all children order
    @Override
    public int getCost() {
        int totalCost = 0;
        // invokes getCost() fn. of all child objects inside it, accumulates cost, and return
        for(Order productObj : productList) {
            totalCost += productObj.getCost();
        }

        return totalCost;
    }

    // Returns all children
    public ArrayList<Order> getProductList() {
        return this.productList;
    }

}
