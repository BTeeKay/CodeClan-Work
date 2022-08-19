import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Passenger passenger1;
    CabinCrew crew1;

    @Before
    public void before() {
        passenger1 = new Passenger("Tina", "Munro", 5);
        crew1 = new CabinCrew("Brian", "Kerr", CabinRank.PURSER);
    }

    @Test
    public void canGetPassengerFirstName() {
        assertEquals("Tina", passenger1.getFirstName());
    }

    @Test
    public void canGetCabinCrewRank() {
        assertEquals(CabinRank.PURSER, crew1.getRank());
    }
}
