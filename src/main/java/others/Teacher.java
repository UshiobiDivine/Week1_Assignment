package others;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staffs{
    private Course courseTaught;
    private List<Course> listOfCoursesTaught;

    //constructs a teacher object with a name (default Constructor)
    public Teacher(String name){
        super(name);
        listOfCoursesTaught = new ArrayList<>();
    }
    //constructs a teacher object with a name and course (Constructor)
    public Teacher(String name, Course courseTaught) {
        super(name);
        this.courseTaught = courseTaught;
        listOfCoursesTaught = new ArrayList<>();
        listOfCoursesTaught.add(courseTaught);
    }

    //returns a list of courses teacher is taking
    public List<Course> getListOfCoursesTaught(){
        return listOfCoursesTaught;
    }
    //allows a teacher to teach a course if not already
    public void teachCourse(Course course){
        if (listOfCoursesTaught.contains(course)) {
            System.out.println("Teacher already teaching this course");
        }else {
            listOfCoursesTaught.add(course);
        }
    }
}
