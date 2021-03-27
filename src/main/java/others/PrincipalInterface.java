package others;
import Class.*;

//an interface for the Principal class
interface PrincipalInterface {
    boolean admitApplicant(Applicant applicant, Clas clas) throws IllegalStateException;
    String expelStudent(Student student, ListOfClasses allClassList);
    void assignCourseToTeacher(Teacher teacher, Course course);
}
