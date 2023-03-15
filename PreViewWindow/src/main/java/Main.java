
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String department;
        String courseNumber;
        String className;
        double attemptedCredits;
        double earnedCredits;
        String letterGrade;
        double points;
        String semester;
        String transferType;
        String repeatCourse = ""; // This variable contains the String "Repeat Excluded" if a course has been taken once before. Default is empty String
        Course course1 = new Course(department = "CS", courseNumber = "6320", className = "Natural Language Processing", attemptedCredits = 3.00,
                earnedCredits = 3.00, letterGrade = "B+", points = 12.00, semester = "2022 Fall", transferType = "test");
        Course course2 = new Course(department = "CS", courseNumber = "6363", className = "Design and Analysis of Computer Algorithms", attemptedCredits = 3.00,
                earnedCredits = 3.00, letterGrade = "B+", points = 12.00, semester = "2021 Fall", transferType = "");
        Course course3 = new Course(department = "CS", courseNumber = "Random", className = "Random", attemptedCredits = 3.00,
                earnedCredits = 3.00, letterGrade = "Random", points = 12.00, semester = "Random", transferType = "Random");
        Course course4 = new Course(department = "CS", courseNumber = "6375", className = "Machine Learning", attemptedCredits = 3.00,
                earnedCredits = 3.00, letterGrade = "A", points = 12.00, semester = "2021 Fall", transferType = "");

        ArrayList<Course> courses = new ArrayList<>();

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        
        PreViewWindow preViewWindow = new PreViewWindow(courses);

    }

}
