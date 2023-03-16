import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
/**
 * This class is primarily used to display the pre-view of the selected Degree Plan using a JFrame, 
 * but it is also used to get some user input through a separate JFrame. 
 * 
 */
public class PreViewWindow{
    private String typeOfDegreePlan = "Intelligent Systems"; // Variable will contain the type of degree plan selected by the user 
    final private String CORE_COURSES_LABEL = "CORE COURSES    (15 Credit Hours)   3.19 Grade Point Average Required";
    final private String APPROVED_6000_LEVEL_ELECTIVES_LABEL = "FIVE APPROVED 6000 LEVEL ELECTIVES    (15 * Credit Hours)    3.0 Grade Point Average";
    final private String ADDITIONAL_ELECTIVES_LABEL = "Additional Electives (3 Credit Hours Minimum)";
    final private String OTHER_REQUIREMENTS = "Other Requirements";
    final private String CYBER_SECURITY = "Cyber Security";
    final private String DATA_SCIENCE = "Data Science";
    final private String INTELLIGENT_SYSTEMS = "Intelligent Systems";
    final private String INTERACTIVE_COMPUTING = "Interactive Computing";
    final private String NETWORKS_AND_TELECOMMUNICATIONS = "Networks and Telecommunications";
    final private String SYSTEMS = "Systems";
    final private String TRADITIONAL_COMPUTER_SCIENCE = "Traditional Computer Science";
    final private String SOFTWARE_ENGINEERING = "Software Engineering";
    private ArrayList<Course> coursesList; // ArrayList contains all the courses read-in from the transcript after some filtering

    /**
     * Constructor. 
     * 
     * @param courses 
     */
    public PreViewWindow(ArrayList<Course> courses){
        this.coursesList = new ArrayList<>(courses); 
        
        createFrameAndTables();
    }

    /**
     * Method creates one frame and within that frame it creates multiple tables. 
     * 
     */
    public void createFrameAndTables(){
        JFrame frame = new JFrame("Pre-view of Degree Plan"); // Creates a new JFrame. This will act as my sole frame to display the 
                                                              // pre-view of the needed Degree Plan  
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int intFlag; // Variable is a integer flag used to distinguish between groups of degree plan types  

        JPanel mainPanel = new JPanel(new BorderLayout());  // Create a new JPanel to act as my main panel in the frame
        JPanel tableContainer = new JPanel(new GridLayout(0, 1)); // Creates a new JPanel with a GridLayout of one column and any number of rows.
                                                                  // This is needed to display all the tables appropriately 
        
        // Check the type of degree plan 
        if (typeOfDegreePlan.equals(DATA_SCIENCE) || typeOfDegreePlan.equals(INTELLIGENT_SYSTEMS) || typeOfDegreePlan.equals(INTERACTIVE_COMPUTING)
                || typeOfDegreePlan.equals(SYSTEMS) || typeOfDegreePlan.equals(TRADITIONAL_COMPUTER_SCIENCE)) 
        {
            final int numberOfTables = 6;
            JPanel[] tablePanels = new JPanel[numberOfTables]; // Array used to hold 6 table panels 
            intFlag = 1;

            // Create table panels and add them to the array
            for (int ix = 0; ix < tablePanels.length; ix++)
            {
                tablePanels[ix] = createTablePanel(intFlag, ix); // Method call 
            }
            
            // Add the table panels to the table container
            for (int i = 0; i < tablePanels.length; i++) 
            {
                tableContainer.add(tablePanels[i]);
            }

            // Add the table container to the main panel
            mainPanel.add(tableContainer, BorderLayout.CENTER);
        } 
        else if (typeOfDegreePlan.equals(CYBER_SECURITY)) // Check the type of degree plan 
        {
            final int numberOfTables = 6;
            JPanel[] tablePanels = new JPanel[numberOfTables]; // Array used to hold 6 table panels
            intFlag = 2;

            // Create table panels and add them to the array
            for (int ix = 1; ix < tablePanels.length; ix++)
            {
                tablePanels[ix] = createTablePanel(intFlag, ix); // Method call
            }

            // Add the table panels to the table container
            for (int ix = 0; ix < tablePanels.length; ix++)
            {
                tableContainer.add(tablePanels[ix]);
            }

            // Add the table container to the main panel
            mainPanel.add(tableContainer, BorderLayout.CENTER);
        } 
        else if (typeOfDegreePlan.equals(NETWORKS_AND_TELECOMMUNICATIONS) || typeOfDegreePlan.equals(SOFTWARE_ENGINEERING)) // Check the type of degree plan 
        {
            final int numberOfTables = 5;
            JPanel[] tablePanels = new JPanel[numberOfTables]; // Array used to hold 5 table panels
            intFlag = 3;

            // Create table panels and add them to the array
            for (int ix = 1; ix < tablePanels.length; ix++)
            {
                tablePanels[ix] = createTablePanel(intFlag, ix); // Method call
            }

            // Add the table panels to the table container
            for (int ix = 0; ix < tablePanels.length; ix++)
            {
                tableContainer.add(tablePanels[ix]);
            }
            // Add the table container to the main panel
            mainPanel.add(tableContainer, BorderLayout.CENTER);
        }
        
        // Create a new JScrollPane and add the mainPanel (which contains the tableContainer) to it
        JScrollPane scrollPane = new JScrollPane(mainPanel); // The new JScrollPane object is used to make the frame scrollable using scroll bar 
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Vertical scroll bar policy is set to always show the scroll bar

        frame.getContentPane().add(scrollPane); // Add the scroll pane to the content pane of the JFrame
        frame.pack(); // Pack the frame, which sets its size to the preferred size of its components
        frame.setVisible(true); // Make the frame visible 
    }
    
    /**
     * Method creates the table panel needed. 
     * Method is called multiple times by the createFrameAndTables() method to create the necessary amount of table panels. Each call is one table panel. 
     * 
     * @param intFlag a integer flag used to distinguish between groups of degree plan types 
     * @param degreePlanSection a integer flag used to distinguish the different sections of the degree plans. Variable correlates to the table as well
     * @return the table panel
     */
    public JPanel createTablePanel(int intFlag, int degreePlanSection){
        JPanel panel = new JPanel(new BorderLayout()); // Create new JPanel, will house the label(s) and table
        JPanel labelPanel = new JPanel(new BorderLayout()); // Create new JPanel, will house the label(s) needed 
        
        labelsForTables(intFlag, degreePlanSection, labelPanel); // Method call 

        TableModel model = new TableModel(); // Create instance of TableModel. TableModel is used to 
                                             // define the structure and data of a table 

        JTable table = new JTable(model); // Create new JTable and pass instance of TableModel. JTable sets up the table to display the data in the desired format 
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        // Create a new JScrollPane and add the table (which contains the data fields) to it
        JScrollPane scrollPane = new JScrollPane(table);// The new JScrollPane object is used to make the table scrollable using scroll bar.
                                                        // However, the scroll bar will only appear when the contents of the table are so many 
                                                        // that some become unviewable through the view port 
                                                        
        table.setPreferredScrollableViewportSize(new Dimension(400, 200)); // Sets view port size 
        
        // Wrap the scroll pane (which contains the JTable) in a Box layout
        Box tableBox = Box.createHorizontalBox();
        tableBox.add(scrollPane); 

        JPanel buttonPanel = new JPanel(); // New JPanel is created for buttons 
        
        JButton addButton = new JButton("Add Row");
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                model.addRow();
                model.fireTableDataChanged(); // This method comes from AbstractTableModel Class and will trigger the TableModelListener's tableChanged() method, 
                                              // which will in turn update the JTable's view with the new data.
            }
        });
        
        JButton deleteButton = new JButton("Delete Row");
        deleteButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) 
                {
                    model.deleteRow(selectedRow);
                    model.fireTableDataChanged(); // This method comes from AbstractTableModel Class and will trigger the TableModelListener's tableChanged()
                                                  // method, which will in turn update the JTable's view with the new data.
                }
            }
        });
        
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        // Wrap the button panel in a Box layout
        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(buttonPanel);

        // Wrap the table and button Box layouts in a vertical Box layout. Components will also be properly spaced and aligned vertically
        Box mainBox = Box.createVerticalBox();
        mainBox.add(Box.createVerticalGlue());
        mainBox.add(tableBox);
        mainBox.add(buttonBox);
        mainBox.add(Box.createVerticalGlue());

        // Add the mainBox layout to the panel
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.add(mainBox, BorderLayout.CENTER);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding 
        panel.add(labelPanel, BorderLayout.NORTH);
        panel.add(tablePanel, BorderLayout.CENTER);

        return panel;
    }

    /**
     * Method is used to create the appropriate labels for each table that is created. 
     * Label is displayed above respective table. 
     * 
     * @param intFlag a integer flag used to distinguish between groups of degree plan types 
     * @param degreePlanSection a integer flag used to distinguish the different sections of the degree plans. Variable correlates to the table as well
     * @param labelPanel the JPanel used to display the labels above there respective table within the mainPanel 
     */
    public void labelsForTables(int intFlag, int degreePlanSection, JPanel labelPanel){
        JLabel label = new JLabel(); // Create JLabel object.  
        
        if (intFlag == 1) // Via a integer flag a check is done to see if the degree plan is one of the following: 
                          // Data Science, Intelligent Systems, Interactive Computing, Systems, or Traditional Computer Science
        {
            if (degreePlanSection == 0) // Check if the section/table needing a label is the first one 
            {
                label = new JLabel(CORE_COURSES_LABEL); // Create label 
                labelPanel.add(label, BorderLayout.NORTH); // Add the label to the label panel 
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding 
            } 
            else if (degreePlanSection == 1) // Check if the section/table needing a label is the second one
            {
                // Different labels are needed for this section/table dependent on the type of degree plan 
                if (typeOfDegreePlan.equals(DATA_SCIENCE) || typeOfDegreePlan.equals(INTELLIGENT_SYSTEMS) || typeOfDegreePlan.equals(SYSTEMS))
                {
                    label = new JLabel("One of the Following Courses");
                } 
                else if (typeOfDegreePlan.equals(INTERACTIVE_COMPUTING))
                {
                    label = new JLabel("Three of the Following Courses");
                }
                else if (typeOfDegreePlan.equals(TRADITIONAL_COMPUTER_SCIENCE)) 
                {
                    label = new JLabel("Two of the Following Courses");
                }

                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding 
            } 
            else if (degreePlanSection == 2) // Check if the section/table needing a label is the third one
            {
                label = new JLabel(APPROVED_6000_LEVEL_ELECTIVES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding 
            } 
            else if (degreePlanSection == 3) // Check if the section/table needing a label is the fourth one
            { 
                label = new JLabel(ADDITIONAL_ELECTIVES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
            } 
            else if (degreePlanSection == 4) // Check if the section/table needing a label is the fifth one
            {
                label = new JLabel(OTHER_REQUIREMENTS);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
            }
        } 
        else if (intFlag == 2) // Via a integer flag a check is done to see if the degree plan is one of the following: 
                               // Cyber Security 
        {
            if (degreePlanSection == 0) // Check if the section/table needing a label is the first one
            {
                label = new JLabel(CORE_COURSES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding 
            }
            else if (degreePlanSection == 1) // Check if the section/table needing a label is the second one
            {
                label = new JLabel("Two of the Following Courses");
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
            } 
            else if (degreePlanSection == 2) // Check if the section/table needing a label is the third one
            {
                label = new JLabel("TWO IA* APPROVED 6000 LEVEL ELECTIVES   (6 Credit Hours)   3.0 Grade Point Average");
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
            }
            else if (degreePlanSection == 3) // Check if the section/table needing a label is the fourth one
            {
                label = new JLabel("CS APPROVED 6000 LEVEL ELECTIVES   (12 Credit Hours)   3.0 Grade Point Average");
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
            }
            else if (degreePlanSection == 4) // Check if the section/table needing a label is the fifth one
            {
                label = new JLabel(OTHER_REQUIREMENTS);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
            } 
            else if (degreePlanSection == 5) // Check if the section/table needing a label is the sixth one
            {
                label = new JLabel("No 5XXX courses can be applied to this degree plan");
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding

            }
        }
        else if (intFlag == 3) // Via a integer flag a check is done to see if the degree plan is one of the following: 
                               // Networks and Telecommunications, or Software Engineering
        {
            if (degreePlanSection == 0) // Check if the section/table needing a label is the first one
            {
                label = new JLabel(CORE_COURSES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding

            } 
            else if (degreePlanSection == 1) // Check if the section/table needing a label is the second one
            {
                label = new JLabel(APPROVED_6000_LEVEL_ELECTIVES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
                
                if (typeOfDegreePlan.equals(SOFTWARE_ENGINEERING)) // An extra label is added if condition is true
                {
                    label = new JLabel("CS 6359 cannot be used on this degree plan");
                    labelPanel.add(label, BorderLayout.CENTER);
                }
            } 
            else if (degreePlanSection == 2) // Check if the section/table needing a label is the third one
            {
                label = new JLabel(ADDITIONAL_ELECTIVES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
            } 
            else if (degreePlanSection == 3) // Check if the section/table needing a label is the fourth one
            {
                label = new JLabel(OTHER_REQUIREMENTS);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adds padding
            }
        }
    }
}
