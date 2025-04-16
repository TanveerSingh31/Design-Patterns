public class Main {

    public static void main(String [] args) {
        RoomAbstract masterRoom1 = new MasterRoom();
        RoomAbstract suiteRoom1 = new SuiteRoom();

        // Added laundry to masterRoom1 -> passing room object to Laundry decorator
        masterRoom1 = new LaundryDecorator(masterRoom1);
        masterRoom1 = new FoodDecorator(masterRoom1);

        System.out.println(masterRoom1.getRoomPrice());
        System.out.println(masterRoom1.getRoomFacilities());



        suiteRoom1 = new FoodDecorator(suiteRoom1);
        System.out.println(suiteRoom1.getRoomPrice());
        System.out.println(suiteRoom1.getRoomFacilities());


    }



}
