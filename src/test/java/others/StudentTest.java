package others;

import org.junit.jupiter.api.Test;
import Class.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student("Oguns",23);
    Clas ss1 = new Clas("SS1");
    Clas ss2 = new Clas("SS2");
    Clas ss3 = new Clas("SS3");

    ListOfClasses list = new ListOfClasses();
    Course maths = new Course("Mathematics");



    @Test
    void getAge() {
        assertEquals(23,student.getAge());
    }

    @Test
    void getName() {
        assertEquals("Oguns",student.getName());

    }

    @Test
    void getCourse() {
        Course eng = new Course("English");
        student.takeCourse(eng);
        student.takeCourse(maths);
        assertEquals(2,student.getNumberOfCourses());
    }

    @Test
    void takeCourse() {
        Course eng = new Course("English");
        student.takeCourse(maths);
        assertEquals(1,student.getNumberOfCourses());
    }

    @Test
    void allCourses() {
        Course eng = new Course("English");
        student.takeCourse(eng);
        assertEquals(1,student.getNumberOfCourses());

    }

    @Test
    void getStudentClass() {

        ss3.addStudentToClass(student);
        list.addAll(ss1,ss2,ss3);
        assertEquals("SS3", student.getStudentClass(list));
    }

}