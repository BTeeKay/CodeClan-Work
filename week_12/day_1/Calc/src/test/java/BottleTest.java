import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;

    @Before
    public void before() {
        bottle = new Bottle();
    }

    @Test
    public void bottleHasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkReducesVolumeByTwn() {
        assertEquals(90, bottle.drink());
    }

    @Test
    public void emptyBottleVolume() {
        assertEquals(0, bottle.empty());
    }

    @Test
    public void fillBottleVolume() {
        bottle.drink();
        assertEquals(100, bottle.fill());
    }
}
