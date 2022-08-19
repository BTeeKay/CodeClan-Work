import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane p1;

    @Before
    public void before() {
        p1 = new Plane("B747", 250, 183500);
    }

    @Test
    public void testFinalVarType() {
        assertEquals("B747", p1.getName());
    }
}
