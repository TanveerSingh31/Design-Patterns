
// Leaf - individual elements (product) that are added into the Box

public class Product implements Order {

    private String name;
    private int cost;


    public Product(String productName, int cost) {
        this.name = productName;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return this.cost;
    }


}
