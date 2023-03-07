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
            new File("create_table.docx"));
 
        // Creating a table
        XWPFTable table = document.createTable();
 
        // Create first row in a table
        XWPFTableRow tableRowOne = table.getRow(0);
 
        // Attributes added to the first table
        tableRowOne.getCell(0).setText("Geeks (0,0)");
        tableRowOne.addNewTableCell().setText("For (0,1)");
        tableRowOne.addNewTableCell().setText(
            "Geeks (0,2)");
 
        // Creating a second row
        XWPFTableRow tableRowTwo = table.createRow();
 
        // Attributes of second row
        tableRowTwo.getCell(0).setText("Geeks (1,0)");
        tableRowTwo.getCell(1).setText("For (1,1)");
        tableRowTwo.getCell(2).setText("Geeks (1,2)");
 
        // Creating a third row
        XWPFTableRow tableRowThree = table.createRow();
 
        // Attributes of row
        tableRowThree.getCell(0).setText("Geeks (2,0)");
        tableRowThree.getCell(1).setText("For (2,1)");
        tableRowThree.getCell(2).setText("Geeks (2,2)");
 
        document.write(out);
        out.close();
 
        // Display message when
        // all data to the rows are inserted
        System.out.println(
            "create_table.docx written successfully");
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