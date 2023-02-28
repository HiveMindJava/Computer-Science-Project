import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class GUI extends JFrame implements ActionListener {
    
    JButton b;//create button  
    JButton existingSutdent;
    JLabel label;
    String file_name;

    public GUI(){
        JFrame frame = new JFrame("Degree Plan/Audit Tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        b = new JButton("Create New Degree Plan/Audit");
        existingSutdent = new JButton("Existing Degree Plan/Audit");
        
        //b.setBounds(100, 100, 225, 50);
        b.setFocusable(false);
        b.addActionListener(this);
        
        //existingSutdent.setBounds(100, 200, 225, 50);
        existingSutdent.setFocusable(false);

        label = new JLabel("Empty");
                
        frame.add(b);//adding button on frame
        frame.add(existingSutdent);
        frame.add(label);

    }

    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == b){
            // Second_Frame frame = new Second_Frame();
            // this.dispose();

            JFileChooser file_upload = new JFileChooser();
            file_upload.setCurrentDirectory(new File("."));

            int res = file_upload.showOpenDialog(null);

            if(res == JFileChooser.APPROVE_OPTION){
                
                this.file_name = file_upload.getSelectedFile().getName();
                File file_path = new File(this.file_name);
                PDFReader pdfReader = new PDFReader(this.file_name);
                label.setText(pdfReader.getReadInPDF());
                GraduateStudent gradStudent = new GraduateStudent(pdfReader.getReadInPDF());

                System.out.println(file_path.getAbsoluteFile());
            }
        }
    }

    public String getFileName(){
        return file_name;
    }

}
