package Class;

import org.junit.jupiter.api.Test;
import others.Student;

import java.io.InvalidObjectException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClasTest {
    Clas clas = new Clas("SS1");

    @Test
    void printAllStudentsInClass() {
        clas.addStudentToClass(new Student("Divine", 23));
        clas.addStudentToClass(new Student("Esther", 21));
        clas.printAllStudentsInClass();
    }

    @Test
    void getClassName() {
        String name = "SS1";
        assertEquals(name, clas.getClassName());
    }

    @Test
    void totalNoOfStudentsInClass() {
        clas.addStudentToClass(new Student("Abigail", 21));
        clas.addStudentToClass(new Student("Maryann", 32));
        assertEquals(clas.totalNoOfStudentsInClass(), 2);
    }

    @Test
    void setClassRep() throws InvalidObjectException {
        Student stu = new Student("Abigail", 21);
        Student stu1 = new Student("Maryann", 19);
        clas.addStudentToClass(stu);
        clas.addStudentToClass(stu1);
        clas.setClassRep(stu);
        assertSame("Abigail", clas.getClassRep());
    }

    @Test
    void getClassRep() throws InvalidObjectException {
        Student stu = new Student("Abigail", 21);
        Student stu1 = new Student("Maryann", 19);
        clas.addStudentToClass(stu);
        clas.addStudentToClass(stu1);
        clas.setClassRep(stu);
        assertEquals(clas.getClassRep(), "Abigail");
        assertNotEquals(clas.getClassRep(), "Maryann");
    }

    @Test
    void addStudentToClass() {
        clas.addStudentToClass(new Student("Mami",23));
        clas.addStudentToClass(new Student("Bolu",24));
        clas.printAllStudentsInClass();
    }

    @Test
    void studentList() {
        clas.addStudentToClass(new Student("Mami",23));
        clas.addStudentToClass(new Student("Bolu",24));
        List<Student> li = clas.studentList();
        assertTrue(li.size() != 0 && li instanceof List);
    }

    @Test
    void removeStudent() {
        Student stu = new Student("Abigail", 21);
        Student stu1 = new Student("Maryann", 19);
        clas.addStudentToClass(stu);
        clas.addStudentToClass(stu1);
        clas.removeStudent(stu);
        assertEquals(clas.totalNoOfStudentsInClass(), 1);
        assertNotEquals(clas.totalNoOfStudentsInClass(), 2);

    }
}