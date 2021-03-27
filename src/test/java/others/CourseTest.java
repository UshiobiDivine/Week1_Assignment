package others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
Course courseTest = new Course("Biology");
    @Test
    void getNameOfCourse() {
        assertEquals("Biology",courseTest.getNameOfCourse());
    }
}