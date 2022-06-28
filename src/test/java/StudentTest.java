import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class StudentTest {

//    Create a student
    @Test
    public void testCreateStudent() {
        Student name = new Student(1L, "James");

        assertNull(otherPerson);
        assertNotNull(name);

    }

//    Fields get updated properly
    @Test
    public void testAllFieldsGetUpdated() {
        Student name = new Student(1L, "Justin");

        assertSame(1L, name.getId());
        assertSame("Justin", name.getName());
        assertSame(null, name.getGrades());
        assertSame(0,name.getGrades().size());

    }


//    Able to add a grade to the application.
    @Test
    public void testAddingGradesWorks() {

    }



//    Average for grade calculations is correct.
    @Test
    public void testAverageGradeWorks() {

    }

}
