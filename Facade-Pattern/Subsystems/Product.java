package Subsystems;

public class Product {
    public void checkIfProductExists() {
        System.out.println("Checking if product exists...");
    }

    public void addProduct() {
        System.out.println("Adding product to the order...");
    }

    public String getStatus() {
        System.out.println("Fetching product status...");
        return "Product is packed and ready to ship.";
    }
}
