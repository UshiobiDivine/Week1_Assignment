package others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    Teacher teacher = new Teacher("Manuel");

    @Test
    void getName() {
        assertEquals("Manuel", teacher.getName());
    }

    @Test
    void getId() {
        assertEquals(2, teacher.getId());

    }

    @Test
    void getListOfCoursesTaught() {
        teacher.teachCourse(new Course("Maths"));
        teacher.teachCourse(new Course("Geo"));
        assertEquals(2, teacher.getListOfCoursesTaught().size());

    }

    @Test
    void teachCourse() {
        teacher.teachCourse(new Course("Maths"));
        assertEquals(1, teacher.getListOfCoursesTaught().size());

    }
}