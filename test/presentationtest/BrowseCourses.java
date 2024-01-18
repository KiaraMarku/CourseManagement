package presentationtest;

import entety.Student;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.CourseService;
import service.StudentService;




public class BrowseCourses {

    private CourseService courseService;
    private StudentService studentService;
    JButton btnJoinDrop;
    JLabel txtCourseName; // Added the label field

    public BrowseCourses(Student mockStudent) {
        // Initialize services or perform any other necessary setup
        this.courseService = new CourseService();
        this.studentService = new StudentService();
    }

    public void showAllCourses() {
        // Dummy implementation for testing
        System.out.println("Showing all courses");
    }

    public void showCourseDetails(String testCourse) {
        // Dummy implementation for testing
        System.out.println("Showing details for course: " + testCourse);
        
        // Set the text for the txtCourseName label
        txtCourseName.setText(testCourse);
    }

    public void btnJoinDropActionPerformed(Object object) {
        String courseName = "TestCourse"; // Replace with the actual course name
        if (studentService.followsCourses(new Student("DummyUser", "TestPassword"), courseName)) {
            studentService.dropCourse(new Student("DummyUser", "TestPassword"), courseName);
            btnJoinDrop.setText("Join");
        } else {
            // Your logic for joining the course
            // For example, you might have a method like studentService.joinCourse(new Student(), courseName);
            studentService.joinCourse(new Student("DummyUser", "TestPassword"), courseName);
            btnJoinDrop.setText("Drop");
        }
    }

    public class RSTableMetro extends JTable {
        // Constructor
        public RSTableMetro(Object[][] data, Object[] columnNames) {
            super(new DefaultTableModel(data, columnNames));
        }
    }

    public JLabel getTxtCourseName() {
        txtCourseName = new JLabel("DummyCourseName"); // Assuming it's a label
        return txtCourseName;
    }

    public JButton getBtnJoinDrop() {
        btnJoinDrop = new JButton("Join"); // Assuming it's a button for joining
        btnJoinDrop.addActionListener(e -> btnJoinDropActionPerformed(e));
        return btnJoinDrop;
    }
}
