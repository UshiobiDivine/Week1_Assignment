package Class;
import others.Student;

import java.io.InvalidObjectException;
import java.util.List;

//an interface for a Student
interface ClassStudent {
    void printAllStudentsInClass();
    String getClassName();
    int totalNoOfStudentsInClass();
    void setClassRep(Student s) throws InvalidObjectException;
    String addStudentToClass(Student student);
    String getClassRep();
    List<Clas> listOfClass();
    List<Student> studentList();
}
