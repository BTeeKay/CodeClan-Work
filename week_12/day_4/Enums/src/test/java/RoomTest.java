import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    RoomType[] roomType = RoomType.values();

    @Before
    public void before() {
        room = new Room(RoomType.DOUBLE);
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, room.getRoomType());
    }

    @Test
    public void doubleHasValueOfTwo() {
        assertEquals(2, room.getValueFromEnum());
    }


}
