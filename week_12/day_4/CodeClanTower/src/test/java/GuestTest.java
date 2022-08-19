import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        guest1 = new Guest("Gillian", "Moynagh", "GM@GM.com");
        guest2 = new Guest("Brian", "Kerr", "btk@bk.com");
    }

    @Test
    public void guestHasFirstName() {
        assertEquals("Gillian", guest1.getFirstName());
    }

    @Test
    public void setGuestFirstName() {
        guest1.setFirstName("Cat");
        assertEquals("Cat", guest1.getFirstName());
    }

}
