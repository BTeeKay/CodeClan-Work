import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructorTest {

    Instructor instructor;

    @Before
    public void before(){
        instructor = new Instructor("Steve", "G29", "Java");
    }


    @Test
    public void hasName(){
        assertEquals("Steve", instructor.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G29", instructor.getCohort());
    }

    @Test
    public void canChangeName(){
        instructor.setName("Jen");
        assertEquals("Jen", instructor.getName());
    }
    @Test
    public void canChangeCohort(){
        instructor.setCohort("G27");
        assertEquals("G27", instructor.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", instructor.talk("Java"));
    }


}