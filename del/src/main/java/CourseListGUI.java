import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CourseListGUI extends JFrame {
    private ArrayList<String> courses = new ArrayList<String>();
    private DefaultListModel<String> listModel = new DefaultListModel<String>();
    private JList<String> courseList = new JList<String>(listModel);
    private JButton selectButton = new JButton("Select");
    private JButton deleteButton = new JButton("Delete");
    private JTextField courseField = new JTextField(10);
    private JButton addButton = new JButton("Add");
    private JLabel selectedLabel = new JLabel("Selected course: None");
    private String selectedCourse = null;

    public CourseListGUI() {
        // Initialize the courses ArrayList with some sample data
        courses.add("Math");
        courses.add("Science");
        courses.add("English");

        // Add the courses to the list model
        for (String course : courses) {
            listModel.addElement(course);
        }

        // Add a selection listener to the courseList
        courseList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                selectButton.setEnabled(true);
                deleteButton.setEnabled(true);
                selectedCourse = courseList.getSelectedValue();
                selectedLabel.setText("Selected course: None");
            }
        });

        // Add an action listener to the selectButton
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedCourse != null) {
                    selectedLabel.setText("Selected course: " + selectedCourse);
                    // Store the selected course for later use
                    // Do whatever you want with the selected course here
                }
            }
        });

        // Add an action listener to the deleteButton
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCourse = courseList.getSelectedValue();
                listModel.removeElement(selectedCourse);
                courses.remove(selectedCourse);
            }
        });

        // Add an action listener to the addButton
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newCourse = courseField.getText();
                if (!newCourse.isEmpty()) {
                    listModel.addElement(newCourse);
                    courses.add(newCourse);
                    courseField.setText("");
                }
            }
        });

        // Create a scroll pane that contains the courseList
        JScrollPane scrollPane = new JScrollPane(courseList);

        // Add the GUI components to the frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(selectButton);
        buttonPanel.add(deleteButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Add the text field and add button to the GUI
        JPanel addPanel = new JPanel();
        addPanel.add(courseField);
        addPanel.add(addButton);
        getContentPane().add(addPanel, BorderLayout.NORTH);

        // Add the selectedLabel to the GUI
        getContentPane().add(selectedLabel, BorderLayout.WEST);

        // Set the window properties
        setTitle("Course List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CourseListGUI();
    }
}
