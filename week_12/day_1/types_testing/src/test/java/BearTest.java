import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear1;
    Bear thinBear;

    @Before
    public void before() {
        bear1 = new Bear("Bobbin", 25, 95.32, 'F');
        thinBear = new Bear("Bobbin", 20, 56.2, 'F');
    }

    @Test
    public void hasName() {
        assertEquals("Bobbin", bear1.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(25, bear1.getAge());
    }

    @Test
    public void hasWeight() {
        assertEquals(95.32, bear1.getWeight(), .01);
    }

    @Test
    public void readyToHibernateIfGreaterThan80() {
        assertEquals(true, bear1.readyToHibernate());
    }

    @Test
    public void notReadyHibernateIfLessThan80() {
        assertEquals(false, thinBear.readyToHibernate());
    }

    @Test
    public void bearGenderF() {
        assertEquals('F', bear1.getGender());
    }
}
