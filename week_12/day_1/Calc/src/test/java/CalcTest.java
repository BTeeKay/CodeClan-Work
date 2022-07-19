import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    Calc calc;

    @Before
    public void before() {
        calc = new Calc();
    }

    @Test
    public void addTwoAndTwo() {
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void subtractFiveAndThree() {
        assertEquals( 2, calc.subtract(5, 3));
    }

    @Test
    public void multiplyThreeAndNine() {
        assertEquals(27, calc.multiply(3, 9));
    }

    @Test
    public void divideTenByFour() {
        assertEquals(2.5, calc.divide(10, 4), 0.0);
    }
}
