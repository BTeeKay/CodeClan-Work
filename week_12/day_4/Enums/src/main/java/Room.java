public class Room {

    private RoomType roomType;

    public Room(RoomType r) {
        this.roomType = r;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
    }
}
