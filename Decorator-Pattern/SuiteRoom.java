public class SuiteRoom extends RoomAbstract {

    private final int basePrice = 5000;

    @Override
    public int getRoomPrice() {
        return basePrice;
    }

    @Override
    public String getRoomFacilities() {
        return "Room Facilities : Suite Room with 2 Beds";
    }


}
