package Class;
import others.Student;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

/*
This class demonstrates a Class (in an actual school)
*/
public class Clas implements ClassStudent{

    private String name;
    private static List<Clas> clasList;
    private static Student classRep;
    private List<Student> listOfStudents;

    static {
        clasList = new ArrayList<>();
    }

    //Construct a Clas object
    public Clas(String name) {
        listOfStudents = new ArrayList<>();
        this.name = name;
        clasList.add(this);
    }

    //prints out all students in a Class
    @Override
    public void printAllStudentsInClass() {
        for (Student s: listOfStudents) {
            System.out.println(s.getName());
        }
    }

    //returns the name of the class
    @Override
    public String getClassName() {
        return name;
    }

    //returns the total number of students in a class
    @Override
    public int totalNoOfStudentsInClass() {
        return listOfStudents.size();
    }

    //makes a student in the class the class representative
    @Override
    public void setClassRep(Student s) throws InvalidObjectException {
        if (!(listOfStudents.contains(s)))
            throw new InvalidObjectException("Student is not in this class");
        classRep = s;
    }

    //returns the name of the class representative
    @Override
    public String getClassRep() {
        return classRep.getName();
    }

    //adds a student to the class
    @Override
    public String addStudentToClass(Student student) {
        //checks if student is already enrolled in the class
        //adds the student if not in the class, otherwise do not
        if (listOfStudents.contains(student)){
            return "Student already in this class";
        }else {
        listOfStudents.add(student);
            return "Student added to the class successfully";
        }
    }

    //returns a list of all classes
    @Override
    public List<Clas> listOfClass() {
        return clasList;
    }

    //returns a list of all stuents
    @Override
    public List<Student> studentList() {
        return listOfStudents;
    }

    //removes a student from a class (assuming student is in the class)
    public boolean removeStudent(Student student){
        return listOfStudents.remove(student);
    }
}
