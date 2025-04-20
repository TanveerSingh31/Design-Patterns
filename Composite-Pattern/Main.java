
// Represents - Client Code
// How it will act with BoxComposite


import java.util.ArrayList;

public class Main {


    public static void main(String [] args) {

        // create individual Leaf(product) objects
        Product p1 = new Product("Phone", 10000);
        Product p2 = new Product("Laptop", 50000);
        Product p3 = new Product("Earphone", 900);
        Product p4 = new Product("Shirt", 3000);


        // Create Box Composite Objects (Orders/Boxes)
        BoxComposite orderObj = new BoxComposite(55511122);
        BoxComposite orderObj2 = new BoxComposite(88990011);

        // Adding individual (Leaf) objects to BoxComposite Object
        orderObj.addProductToOrder(p1);
        orderObj.addProductToOrder(p2);

        // Adding other box composite Object to Bigger Box Composite Object
        orderObj2.addProductToOrder(orderObj);

        orderObj2.addProductToOrder(p3);
        orderObj2.addProductToOrder(p4);


        int cost1 = orderObj.getCost();
        System.out.println("smaller box cost = " + cost1);

        int cost2 = orderObj2.getCost();
        System.out.println("Larger box cost = " + cost2);


        // remove some items
        orderObj.removeProductFromOrder(p1);

        int cost1After = orderObj.getCost();
        System.out.println("smaller box cost after removing Phone = " + cost1After);

        int cost2After = orderObj2.getCost();
        System.out.println("Larger box cost Phone from smaller box = " + cost2After);



        // returns all children of an order
        ArrayList<Order> orderList = orderObj2.getProductList();
        System.out.println(" ----------- Products inside order2 -----------");
        for(Order product : orderList) {
            System.out.println(product);
        }
    }


}
