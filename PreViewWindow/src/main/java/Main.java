
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String readInTxt = ""; // Variable holds the entire content of the filePath specified Text file
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


        File txtFile; // Variable will only be used to open the Default.txt file 

        // Open a TXT file named Default.txt
        txtFile = new File("Default.txt"); // File is located amongst the program folders 

        if (txtFile.exists() && txtFile.isFile() && txtFile.getName().endsWith(".txt")) // Check if the file exists, is a file (not a directory), and has a ".txt" extension 
        {
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(txtFile));
            StringBuilder sringBuilder = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                sringBuilder.append(line);
                sringBuilder.append(System.lineSeparator()); // Append newline character after each line
            }

            bufferedReader.close(); // Close BufferedReader
            readInTxt = sringBuilder.toString(); // Store the contents of the file
        } else {
            System.out.println("Default.txt file not found.");
            System.out.println("Application has terminated due to error. Goodbye!");
            System.exit(0);
        }

        ParsingAlgorithms parseTXTFILE = new ParsingAlgorithms();
        parseTXTFILE.parseDefaultTracks(readInTxt);
        parseTXTFILE.parseDefaultLeveling(readInTxt);      
        parseTXTFILE.parseDefaultCourses(readInTxt);
        
        PreViewWindow window = new PreViewWindow(courses, parseTXTFILE.getDefaultCSTracks(), parseTXTFILE.getDefaultSETracks(), parseTXTFILE.getDefaultLeveling(),parseTXTFILE.getDefaultCoursesMap()); 
        //parseTXTFILE.printHashMap();

    }

}
