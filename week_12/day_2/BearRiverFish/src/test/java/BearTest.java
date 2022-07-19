import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

//    bear beats fish
//    fish beats river
//    river beats bear
    private Bear bear;
    private Salmon salmon;
    private River river;

    @Before
    public void before() {
        bear = new Bear("Dev");
        salmon = new Salmon();
        river = new River();
        river.addFish(salmon);
    }

    @Test
    public void emptyBelly() {
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon() {
        bear.eatFishFromRiver(river);
        assertEquals(0, river.getFishCount());
    }

    @Test
    public void shouldEmptyAfterSleeping() {
        bear.eatFishFromRiver(river);
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }
}
