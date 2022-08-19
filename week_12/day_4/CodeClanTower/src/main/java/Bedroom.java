import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
    }

    public int getCapacityOne(){
        return this.getCapacity();
    }
}
