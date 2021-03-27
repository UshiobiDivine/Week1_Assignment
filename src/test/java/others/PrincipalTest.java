package others;

import org.junit.jupiter.api.Test;
import Class.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

        Student student = new Student("Divine", 23);
        Student student1 = new Student("Gerald", 32);
        Student student2 = new Student("Biola", 19);
        Student student3 = new Student("Ushiobi", 26);

        Applicant applicant = new Applicant("John", 24);
        Applicant applicant1 = new Applicant("Abigail", 17);
        Clas SS1 = new Clas("SS1");

        Teacher teacher = new Teacher("Mr John");
        Course chemistry = new Course("Chemistry");

        Principal principal = new Principal("Mr Adesanya");



    @Test
    void getName() {
        assertEquals("Mr Adesanya",principal.getName());
    }

    @Test
    void getId() {
        assertEquals(1,principal.getId());
    }

    @Test()
    void admitApplicant() {
        assertThrows(IllegalArgumentException.class,() -> principal.admitApplicant(applicant1,SS1));
        assertTrue(principal.admitApplicant(applicant,SS1));

    }

    @Test
    void expelStudent() {
        principal.admitApplicant(applicant,SS1);
        principal.admitApplicant(new Applicant("Okon",21),SS1);
        principal.admitApplicant(new Applicant("Bristo",27),SS1);

        assertEquals(3,SS1.studentList().size());

    }

    @Test
    void assignCourseToTeacher() {
        principal.assignCourseToTeacher(teacher, chemistry);
        teacher.teachCourse(new Course("Physiology"));

        List<Course> list = teacher.getListOfCoursesTaught();
        assertEquals(2,list.size());
    }
}