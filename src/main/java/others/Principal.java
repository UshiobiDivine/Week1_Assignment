package others;
import Class.*;

public class Principal extends Staffs implements PrincipalInterface{

    //constructs a principal object
    public Principal(String name) {
        super(name);
    }

    //allows principal to admit a student
    @Override
    public boolean admitApplicant(Applicant applicant, Clas clasTo) throws IllegalArgumentException {
        Student s = applicant; //upcasting
            //checks if student already in class
            if (clasTo.studentList().contains(s)) {
                throw new IllegalArgumentException("Student already in the school");
            }else {
                //admit the student if older than 18 else throw an exception
                if (s.getAge()>18)
                    return clasTo.studentList().add(s);
                throw new IllegalArgumentException("Student is below 18 and cannot be admitted");
            }
    }

    //allows principal to expel a student
    @Override
    public String expelStudent(Student student, ListOfClasses allClassList) {
        //checks if the student is in the school first else prints "Student not in the school"
        for (Clas c: allClassList.addAll()) {
                if (c.studentList().contains(student)) {
                    c.studentList().remove(student);
                    System.out.print(student.getName());
                    return " has been expelled";
                }
        }
        return "Student not in the school";
    }

    //allows principal to assign a course to a teacher if the teacher is not taking the course already
    @Override
    public void assignCourseToTeacher(Teacher teacher, Course course) {
        if (teacher.getListOfCoursesTaught().contains(course)){
            System.out.println("Teacher already taking the course");
        }else {
            teacher.teachCourse(course);
        }
    }
}
