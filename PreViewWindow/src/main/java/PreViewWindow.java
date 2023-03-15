
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
//import javax.swing.table.AbstractTableModel;
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

public class PreViewWindow {

    private String typeOfDegreePlan = "Intelligent Systems";
    private int degreePlanSection;
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
    private ArrayList<Course> coursesList;

    public void labelsForTables(int intFlag, int degreePlanSection, JPanel labelPanel) {
        JLabel label = new JLabel();
        if (intFlag == 1) {
            if (degreePlanSection == 0) {
                label = new JLabel(CORE_COURSES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            } else if (degreePlanSection == 1) {
                if (typeOfDegreePlan.equals(DATA_SCIENCE) || typeOfDegreePlan.equals(INTELLIGENT_SYSTEMS) || typeOfDegreePlan.equals(SYSTEMS)) {
                    label = new JLabel("One of the Following Courses");
                } else if (typeOfDegreePlan.equals(INTERACTIVE_COMPUTING)) {
                    label = new JLabel("Three of the Following Courses");
                } else if (typeOfDegreePlan.equals(TRADITIONAL_COMPUTER_SCIENCE)) {
                    label = new JLabel("Two of the Following Courses");
                }

                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            } else if (degreePlanSection == 2) {
                label = new JLabel(APPROVED_6000_LEVEL_ELECTIVES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top
            } else if (degreePlanSection == 3) {
                label = new JLabel(ADDITIONAL_ELECTIVES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            } else if (degreePlanSection == 4) {
                label = new JLabel(OTHER_REQUIREMENTS);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            }
        } else if (intFlag == 2) {
            if (degreePlanSection == 0) {
                label = new JLabel(CORE_COURSES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            } else if (degreePlanSection == 1) {
                label = new JLabel("Two of the Following Courses");
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            } else if (degreePlanSection == 2) {
                label = new JLabel("TWO IA* APPROVED 6000 LEVEL ELECTIVES   (6 Credit Hours)   3.0 Grade Point Average");
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            } else if (degreePlanSection == 3) {
                label = new JLabel("CS APPROVED 6000 LEVEL ELECTIVES   (12 Credit Hours)   3.0 Grade Point Average");
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            } else if (degreePlanSection == 4) {
                label = new JLabel(OTHER_REQUIREMENTS);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            } else if (degreePlanSection == 5) {
                label = new JLabel("No 5XXX courses can be applied to this degree plan");
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top

            }
        } else if (intFlag == 3) {
            if (degreePlanSection == 0) {
                label = new JLabel(CORE_COURSES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top
                //panel.add(labelPanel, BorderLayout.NORTH);
            } else if (degreePlanSection == 1) {
                label = new JLabel(APPROVED_6000_LEVEL_ELECTIVES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top
                if (typeOfDegreePlan.equals(SOFTWARE_ENGINEERING)) {
                    label = new JLabel("CS 6359 cannot be used on this degree plan");
                    labelPanel.add(label, BorderLayout.CENTER);
                }

            } else if (degreePlanSection == 2) {
                label = new JLabel(ADDITIONAL_ELECTIVES_LABEL);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top
                //panel.add(labelPanel, BorderLayout.NORTH);
            } else if (degreePlanSection == 3) {
                label = new JLabel(OTHER_REQUIREMENTS);
                labelPanel.add(label, BorderLayout.NORTH);
                labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the top
            }
        }
    }

    public JPanel createTablePanel(int intFlag, int degreePlanSection) {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel labelPanel = new JPanel(new BorderLayout());
        labelsForTables(intFlag, degreePlanSection, labelPanel);

        TableModel model = new TableModel();

        JTable table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        JScrollPane scrollPane = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(400, 200));
        // Wrap the scroll pane in a Box layout
        Box tableBox = Box.createHorizontalBox();
        // tableBox.add(Box.createHorizontalGlue());
        tableBox.add(scrollPane);
        //tableBox.add(Box.createHorizontalGlue());
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Row");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.addRow();
                model.fireTableDataChanged();

            }
        });
        JButton deleteButton = new JButton("Delete Row");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.deleteRow(selectedRow);
                    model.fireTableDataChanged();
                }
            }
        });
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        // Wrap the button panel in a Box layout
        Box buttonBox = Box.createHorizontalBox();
        //buttonBox.add(Box.createHorizontalGlue());
        buttonBox.add(buttonPanel);
        //buttonBox.add(Box.createHorizontalGlue());

        // Wrap the table and button Box layouts in a vertical Box layout
        Box mainBox = Box.createVerticalBox();
        mainBox.add(Box.createVerticalGlue());
        mainBox.add(tableBox);
        // mainBox.add(Box.createVerticalStrut(2));
        mainBox.add(buttonBox);
        mainBox.add(Box.createVerticalGlue());

        // Add the main Box layout to the panel
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.add(mainBox, BorderLayout.CENTER);
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // add some padding to the sides

        panel.add(labelPanel, BorderLayout.NORTH);
        panel.add(tablePanel, BorderLayout.CENTER);

        return panel;
    }

    public PreViewWindow(ArrayList<Course> courses) {
        this.coursesList = new ArrayList<>(courses);
        createFrameAndTables();

    }

    public void createFrameAndTables() {
        JFrame frame = new JFrame("Pre-view of Courses");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int intFlag;

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel tableContainer = new JPanel(new GridLayout(0, 1));
        if (typeOfDegreePlan.equals(DATA_SCIENCE) || typeOfDegreePlan.equals(INTELLIGENT_SYSTEMS) || typeOfDegreePlan.equals(INTERACTIVE_COMPUTING)
                || typeOfDegreePlan.equals(SYSTEMS) || typeOfDegreePlan.equals(TRADITIONAL_COMPUTER_SCIENCE)) {
            final int numberOfTables = 6;
            JPanel[] tablePanels = new JPanel[numberOfTables];
            intFlag = 1;

            // Create the remaining table panels (without headers) and add them to the array
            for (int ix = 0; ix < tablePanels.length; ix++) {
                tablePanels[ix] = createTablePanel(intFlag, ix);
            }

            // Add the table panels to the table container
            for (int i = 0; i < tablePanels.length; i++) {
                tableContainer.add(tablePanels[i]);
            }

            // Add the table container to the main panel
            mainPanel.add(tableContainer, BorderLayout.CENTER);
        } else if (typeOfDegreePlan.equals(CYBER_SECURITY)) {
            final int numberOfTables = 6;
            JPanel[] tablePanels = new JPanel[numberOfTables];
            intFlag = 2;

            // Create the remaining table panels (without headers) and add them to the array
            for (int ix = 1; ix < tablePanels.length; ix++) {
                tablePanels[ix] = createTablePanel(intFlag, ix);
            }

            // Add the table panels to the table container
            for (int ix = 0; ix < tablePanels.length; ix++) {
                tableContainer.add(tablePanels[ix]);
            }

            // Add the table container to the main panel
            mainPanel.add(tableContainer, BorderLayout.CENTER);
        } else if (typeOfDegreePlan.equals(NETWORKS_AND_TELECOMMUNICATIONS) || typeOfDegreePlan.equals(SOFTWARE_ENGINEERING)) {
            final int numberOfTables = 5; 
            JPanel[] tablePanels = new JPanel[numberOfTables];
            intFlag = 3;

            // Create the remaining table panels (without headers) and add them to the array
            for (int ix = 1; ix < tablePanels.length; ix++) {
                tablePanels[ix] = createTablePanel(intFlag, ix);
            }

            // Add the table panels to the table container
            for (int ix = 0; ix < tablePanels.length; ix++) {
                tableContainer.add(tablePanels[ix]);
            }
            // Add the table container to the main panel
            mainPanel.add(tableContainer, BorderLayout.CENTER);
        }

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
