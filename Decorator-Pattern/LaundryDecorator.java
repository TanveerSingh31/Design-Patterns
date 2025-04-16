public class LaundryDecorator extends RoomDecorator {

    // All decorator classes will store the concrete class obj.
    // Anyone can be stored here MasterRoom / SuiteRoom depending on which object we pass while creating its object
    RoomAbstract roomObj;

    public LaundryDecorator(RoomAbstract roomObj) {
        this.roomObj = roomObj;
    }

    @Override
    public int getRoomPrice() {
        // get price of object it is storing , and add your price to it.
        return roomObj.getRoomPrice() + 100;
    }

    @Override
    public String getRoomFacilities() {
        // get facilities of object it is storing , and add your facilities to it.
        return roomObj.getRoomFacilities() + " and Laundry service provided";
    }



}
