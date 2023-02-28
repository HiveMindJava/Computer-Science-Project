import java.util.*;

public class GraduateStudent{
    HashMap<String, GraduateStudent> mapA = new HashMap<>();
    
    private String pdfContentArray[]; // Variable holds the entire content of the fileName specified PDF
    
    GraduateStudent(String readInPDF){
        setPdfContentArray(readInPDF.split("\\r?\\n"));
        System.out.println(readInPDF.split("\\r?\\n"));
    }

    public String getName(String file){
        return null;
    }

    public String getID(String file){
        return null;
    }


    /**
     * @return the pdfContentArray
     */
    public String[] getPDFContentArray() {
        return pdfContentArray;
    }

    /**
     * @param pdfContentArray the pdfContentArray to set
     */
    public void setPdfContentArray(String[] pdfContentArray) {
        this.pdfContentArray = pdfContentArray;
    }

    
    
}
