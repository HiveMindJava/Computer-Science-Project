import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
public class ConvertToWord {
    // Main driver method
    public static void main(String[] args) throws Exception
    {
        /*String filename = "Jones, Keeley DP-Intelligent Systems.pdf";

        readFile(filename);*/
        // Creating a blank Document
        XWPFDocument document = new XWPFDocument();
 
        // Writing the Document in file system
        FileOutputStream out = new FileOutputStream(
            new File("createTest2_table.docx"));
 
        // Creating a table
        XWPFTable table = document.createTable();
 
        // Create first row in a table
        XWPFTableRow tableRowOne = table.getRow(0);
 
        // Attributes added to the first table
        tableRowOne.getCell(0).setText("Degree Plan           ");
        tableRowOne.addNewTableCell().setText("                    ");
        tableRowOne.addNewTableCell().setText("                    ");
        tableRowOne.addNewTableCell().setText("                    ");
        tableRowOne.addNewTableCell().setText("Fast Track          ");
 
        // Creating a second row
        XWPFTableRow tableRowTwo = table.createRow();
 
        // Attributes of second row
        tableRowTwo.getCell(0).setText("Student Info");
        tableRowTwo.getCell(1).setText("          ");
        tableRowTwo.getCell(2).setText("          ");
        tableRowTwo.getCell(3).setText("          ");
        tableRowTwo.getCell(4).setText("Thesis    ");
 
        // Creating a third row
        XWPFTableRow tableRowThree = table.createRow();
 
        // Attributes of row
        tableRowThree.getCell(0).setText("Course Title");
        tableRowThree.getCell(1).setText("Course Number");
        tableRowThree.getCell(2).setText("UTD Semester");
        tableRowThree.getCell(3).setText("Transfer");
        tableRowThree.getCell(4).setText("Grade");

        // Creating a fourth row
        XWPFTableRow tableRowFour = table.createRow();
 
        // Attributes of row
        tableRowFour.getCell(0).setText("CORE COURSES");
        tableRowFour.getCell(1).setText("          ");
        tableRowFour.getCell(2).setText("          ");
        tableRowFour.getCell(3).setText("          ");
        tableRowFour.getCell(4).setText("          ");
        setCellColor(tableRowFour);


        // Creating five blank rows
        XWPFTableRow tableRowFive = table.createRow();
 
        // Attributes of row
        tableRowFive.getCell(0).setText("          ");
        tableRowFive.getCell(1).setText("          ");
        tableRowFive.getCell(2).setText("          ");
        tableRowFive.getCell(3).setText("          ");
        tableRowFive.getCell(4).setText("          ");

        
        XWPFTableRow tableRowSix = table.createRow();
 
        // Attributes of row
        tableRowSix.getCell(0).setText("          ");
        tableRowSix.getCell(1).setText("          ");
        tableRowSix.getCell(2).setText("          ");
        tableRowSix.getCell(3).setText("          ");
        tableRowSix.getCell(4).setText("          ");

        
        XWPFTableRow tableRowSeven = table.createRow();
 
        // Attributes of row
        tableRowSeven.getCell(0).setText("          ");
        tableRowSeven.getCell(1).setText("          ");
        tableRowSeven.getCell(2).setText("          ");
        tableRowSeven.getCell(3).setText("          ");
        tableRowSeven.getCell(4).setText("          ");

        XWPFTableRow tableRowEight = table.createRow();
 
        // Attributes of row
        tableRowEight.getCell(0).setText("          ");
        tableRowEight.getCell(1).setText("          ");
        tableRowEight.getCell(2).setText("          ");
        tableRowEight.getCell(3).setText("          ");
        tableRowEight.getCell(4).setText("          ");

        XWPFTableRow tableRowNine = table.createRow();
 
        // Attributes of row
        tableRowNine.getCell(0).setText("          ");
        tableRowNine.getCell(1).setText("          ");
        tableRowNine.getCell(2).setText("          ");
        tableRowNine.getCell(3).setText("          ");
        tableRowNine.getCell(4).setText("          ");

        // Creating tenth row
        XWPFTableRow TableRowTen = table.createRow();
 
        // Attributes of row
        TableRowTen.getCell(0).setText("ONE OF THE FOLLOWING");
        TableRowTen.getCell(1).setText("          ");
        TableRowTen.getCell(2).setText("          ");
        TableRowTen.getCell(3).setText("          ");
        TableRowTen.getCell(4).setText("          ");

        //Creating 3 blank rows
        XWPFTableRow tableRowEleven = table.createRow();
 
        // Attributes of row
        tableRowEleven.getCell(0).setText("          ");
        tableRowEleven.getCell(1).setText("          ");
        tableRowEleven.getCell(2).setText("          ");
        tableRowEleven.getCell(3).setText("          ");
        tableRowEleven.getCell(4).setText("          ");

        XWPFTableRow tableRowTwelve = table.createRow();
 
        // Attributes of row
        tableRowTwelve.getCell(0).setText("          ");
        tableRowTwelve.getCell(1).setText("          ");
        tableRowTwelve.getCell(2).setText("          ");
        tableRowTwelve.getCell(3).setText("          ");
        tableRowTwelve.getCell(4).setText("          ");

        XWPFTableRow tableRowThirteen = table.createRow();
 
        // Attributes of row
        tableRowThirteen.getCell(0).setText("          ");
        tableRowThirteen.getCell(1).setText("          ");
        tableRowThirteen.getCell(2).setText("          ");
        tableRowThirteen.getCell(3).setText("          ");
        tableRowThirteen.getCell(4).setText("          ");

        // Creating Fourteenth row
        XWPFTableRow TableRowFourteenth = table.createRow();
 
        // Attributes of row
        TableRowFourteenth.getCell(0).setText("Additional Electives");
        TableRowFourteenth.getCell(1).setText("          ");
        TableRowFourteenth.getCell(2).setText("          ");
        TableRowFourteenth.getCell(3).setText("          ");
        TableRowFourteenth.getCell(4).setText("          ");

        //Creating 5 blank rows
        XWPFTableRow tableRowFifteen = table.createRow();
 
        // Attributes of row
        tableRowFifteen.getCell(0).setText("          ");
        tableRowFifteen.getCell(1).setText("          ");
        tableRowFifteen.getCell(2).setText("          ");
        tableRowFifteen.getCell(3).setText("          ");
        tableRowFifteen.getCell(4).setText("          ");

        XWPFTableRow tableRowSixteen = table.createRow();
 
        // Attributes of row
        tableRowSixteen.getCell(0).setText("          ");
        tableRowSixteen.getCell(1).setText("          ");
        tableRowSixteen.getCell(2).setText("          ");
        tableRowSixteen.getCell(3).setText("          ");
        tableRowSixteen.getCell(4).setText("          ");

        XWPFTableRow tableRowSeventeen = table.createRow();
 
        // Attributes of row
        tableRowSeventeen.getCell(0).setText("          ");
        tableRowSeventeen.getCell(1).setText("          ");
        tableRowSeventeen.getCell(2).setText("          ");
        tableRowSeventeen.getCell(3).setText("          ");
        tableRowSeventeen.getCell(4).setText("          ");

        XWPFTableRow tableRowEighteen = table.createRow();
 
        // Attributes of row
        tableRowEighteen.getCell(0).setText("          ");
        tableRowEighteen.getCell(1).setText("          ");
        tableRowEighteen.getCell(2).setText("          ");
        tableRowEighteen.getCell(3).setText("          ");
        tableRowEighteen.getCell(4).setText("          ");

        XWPFTableRow tableRowNineteen = table.createRow();
 
        // Attributes of row
        tableRowNineteen.getCell(0).setText("          ");
        tableRowNineteen.getCell(1).setText("          ");
        tableRowNineteen.getCell(2).setText("          ");
        tableRowNineteen.getCell(3).setText("          ");
        tableRowNineteen.getCell(4).setText("          ");

        XWPFTableRow tableRowTwenty = table.createRow();
 
        // Attributes of row
        tableRowTwenty.getCell(0).setText("          ");
        tableRowTwenty.getCell(1).setText("          ");
        tableRowTwenty.getCell(2).setText("          ");
        tableRowTwenty.getCell(3).setText("          ");
        tableRowTwenty.getCell(4).setText("          ");

        // Creating Fourteenth row
        XWPFTableRow TableRowTwentyOne = table.createRow();
 
        // Attributes of row
        TableRowTwentyOne.getCell(0).setText("Additional Electives");
        TableRowTwentyOne.getCell(1).setText("          ");
        TableRowTwentyOne.getCell(2).setText("          ");
        TableRowTwentyOne.getCell(3).setText("          ");
        TableRowTwentyOne.getCell(4).setText("          ");

        //Creating 5 blank rows
        XWPFTableRow tableRowTwentyTwo = table.createRow();
 
        // Attributes of row
        tableRowTwentyTwo.getCell(0).setText("          ");
        tableRowTwentyTwo.getCell(1).setText("          ");
        tableRowTwentyTwo.getCell(2).setText("          ");
        tableRowTwentyTwo.getCell(3).setText("          ");
        tableRowTwentyTwo.getCell(4).setText("          ");

        XWPFTableRow tableRowTwentyThree = table.createRow();
 
        // Attributes of row
        tableRowTwentyThree.getCell(0).setText("          ");
        tableRowTwentyThree.getCell(1).setText("          ");
        tableRowTwentyThree.getCell(2).setText("          ");
        tableRowTwentyThree.getCell(3).setText("          ");
        tableRowTwentyThree.getCell(4).setText("          ");

        XWPFTableRow tableRowTwentyFour = table.createRow();
 
        // Attributes of row
        tableRowTwentyFour.getCell(0).setText("          ");
        tableRowTwentyFour.getCell(1).setText("          ");
        tableRowTwentyFour.getCell(2).setText("          ");
        tableRowTwentyFour.getCell(3).setText("          ");
        tableRowTwentyFour.getCell(4).setText("          ");

        XWPFTableRow tableRowTwentyFive = table.createRow();
 
        // Attributes of row
        tableRowTwentyFive.getCell(0).setText("          ");
        tableRowTwentyFive.getCell(1).setText("          ");
        tableRowTwentyFive.getCell(2).setText("          ");
        tableRowTwentyFive.getCell(3).setText("          ");
        tableRowTwentyFive.getCell(4).setText("          ");

        XWPFTableRow tableRowTwentySix = table.createRow();
 
        // Attributes of row
        tableRowTwentySix.getCell(0).setText("          ");
        tableRowTwentySix.getCell(1).setText("          ");
        tableRowTwentySix.getCell(2).setText("          ");
        tableRowTwentySix.getCell(3).setText("          ");
        tableRowTwentySix.getCell(4).setText("          ");

        XWPFTableRow tableRowTwentySeven = table.createRow();
 
        // Attributes of row
        tableRowTwentySeven.getCell(0).setText("          ");
        tableRowTwentySeven.getCell(1).setText("          ");
        tableRowTwentySeven.getCell(2).setText("          ");
        tableRowTwentySeven.getCell(3).setText("          ");
        tableRowTwentySeven.getCell(4).setText("          ");

        XWPFTableRow tableRowTwentyEight = table.createRow();
 
        // Attributes of row
        tableRowTwentyEight.getCell(0).setText("Signature Field");
        tableRowTwentyEight.getCell(1).setText("          ");
        tableRowTwentyEight.getCell(2).setText("          ");
        tableRowTwentyEight.getCell(3).setText("          ");
        tableRowTwentyEight.getCell(4).setText("          ");

        document.write(out);
        out.close();
 
        // Display message when
        // all data to the rows are inserted
        System.out.println(
            "create_table.docx written successfully");
    }

    public static void setCellColor(XWPFTableRow row){
        int size = row.getTableCells().size();
        for(int i = 0; i < size; i++){
            row.getCell(i).setColor("d4d404");
        }
        System.out.println("Changed color to yellow");
    }
    /*public static void readFile(String filePath) {
        try{
            // Create a File object from the specified file path
            File file = new File(filePath);
    
            // Check if the file exists, is a file (not a directory), and has a ".pdf" extension
            if (file.exists() && file.isFile() && file.getName().endsWith(".pdf")) 
            {
                PDDocument document = PDDocument.load(file); // Load the PDF document 
                
                // Extract the text from the PDF file
                PDFTextStripper textStripper = new PDFTextStripper();
                setReadInPDF(textStripper.getText(document));
                
                document.close(); // Close the PDF document 
            } 
            else if (file.exists() && file.isFile() && file.getName().endsWith(".txt")) // Check if the file exists, is a file (not a directory), and has a ".txt" extension
            {
                
            }
            else 
            {
                System.out.println("No file found at the specified path: " + filePath);
            }
        } catch (NullPointerException e){ // Catch if filePath is null
            System.out.println();
            System.out.println("An error has occurred! File path is null.");
            System.out.println("Application has terminated due to error. Goodbye!");
            System.exit(0);
        }
    }*/
}