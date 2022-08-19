import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    public Bedroom room1;

    @Before
    public void before() {
        room1 = new Bedroom(101, RoomType.DOUBLE);
    }

    @Test
    public void room1HasIntValue() {
        assertEquals(2, room1.getCapacityOne());
    }

}
