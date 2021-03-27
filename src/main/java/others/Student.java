package others;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import Class.*;
import java.util.List;

//a student class
public class Student {
    //fields
    private String name;
    private int age;
    private Course course;
    private static int studentId = 0;
    private List<Course> courseList;

    //constructs a student object and initialises the list of courses offered by student
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        courseList = new ArrayList<>();
        studentId++;
    }
    //returns student's age
    public int getAge() {
        return age;
    }

    //returns student's name
    public String getName() {
        return name;
    }

    //returns the total number of courses offered by student
    public int getNumberOfCourses() {
        return courseList.size();
    }

    //allows the student to take a course if not taking it already
    public void takeCourse(Course courseTake) {
        if(courseList.contains(courseTake)) {
            System.out.println("Student already taking this course");
            return;
        }
        courseList.add(courseTake);
    }

    //prints all courses taken by student
    public void allCourses(){
        for (Course c: courseList) {
            System.out.println(c.getNameOfCourse());
        }
        System.out.printf("Total number of courses student is currently taking are %d",courseList.size());
    }

    //returns the class the student belong to if a student in the school
    public String getStudentClass(ListOfClasses clas){
        for (Clas c:clas.addAll()) {
                for (Student s : c.studentList()) {
                        return c.getClassName();
                }
        }
        return "Student not in any class";
    }

}
