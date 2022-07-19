import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    NumberList myNumbers;

    @Before
    public void before() {
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(4, myNumbers.getNumberCount());
    }

    @Test
    public void canAddNumberToList() {
        assertEquals(4, myNumbers.getNumberCount());
    }

    @Test
    public void getFirstNumber() {
        myNumbers.addNumbers(69);
        assertEquals(69, myNumbers.getNumberAtIndex(4));
    }

    @Test
    public void canGetTotal() {
        assertEquals(10, myNumbers.getTotal());
    }
}
