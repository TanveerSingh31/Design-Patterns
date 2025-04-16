public class MasterRoom extends RoomAbstract {

    private final int roomPrice = 2000;

    @Override
    public int getRoomPrice() {
        return roomPrice;
    }

    @Override
    public String getRoomFacilities() {
        return "Room Facilities : Master Bed";
    }

}

