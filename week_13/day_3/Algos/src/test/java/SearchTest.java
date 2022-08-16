import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SearchTest {

    Search search;
    ArrayList<Integer> myNumbers;

    @Before
    public void before() {
        search = new Search();
        myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(3);
        myNumbers.add(7);
        myNumbers.add(8);
        myNumbers.add(9);
        myNumbers.add(21);
        myNumbers.add(23);
        myNumbers.add(45);
        myNumbers.add(56);
    }
}
