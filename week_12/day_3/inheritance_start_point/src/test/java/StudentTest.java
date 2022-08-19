import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student student;

    @Before
    public void before(){
        student = new Student("Chris", "G29");
    }


    @Test
    public void hasName(){
        assertEquals("Chris", student.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G29", student.getCohort());
    }

    @Test
    public void canChangeName(){
        student.setName("Rob");
        assertEquals("Rob", student.getName());
    }
    @Test
    public void canChangeCohort(){
        student.setCohort("G29");
        assertEquals("G29", student.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", student.talk("Java"));
    }
}