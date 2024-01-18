/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentationtest;

import entety.Course;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import presentation.MyCourses;
import service.CourseService;

public class MyCoursesTest {

    private MyCourses yourClassInstance;
    private CourseService mockCourseService;
    private Object mockStudentService;

    @BeforeEach
    public void setUp() {
        mockCourseService = mock(MockCourseService.class);
        yourClassInstance = new MyCourses(mockCourseService);
    }
    @AfterEach
    public void tearDown() {
        // Clean up resources after each test (if needed)
        yourClassInstance = null;
    }

   
    @Test
    public void testShowMyCourses() {
        // Create mock data for the CourseService
        List<Course> mockCourses = Arrays.asList(
            new Course("Course1"),
            new Course("Course2"),
            new Course("Course3")
        );

        // Set up the CourseService mock to return the mock data
        when(mockCourseService.getStudentCourses(anyString())).thenReturn(mockCourses);

        // Call the method to be tested
        yourClassInstance.showMyCourses();

        // Get the table model from the table
        DefaultTableModel model = (DefaultTableModel) yourClassInstance.getTblCourse().getModel();

        // Assert the expected number of rows in the table model
        assertEquals(mockCourses.size(), model.getRowCount());

        // Assert the content of the first row
        assertEquals(mockCourses.get(0).getName(), model.getValueAt(0, 0));

        // Add more assertions as needed for other rows or data
    }


   
   @Test
    public void testShowCourseDetails() {
        // Create mock data for the CourseService
        Course mockCourse = new Course("MockCourse");
        when(mockCourseService.getCourseDetails(anyString())).thenReturn(mockCourse);

        // Call the method to be tested
        yourClassInstance.showCourseDetails("MockCourse");

        // Assert the labels' text based on the mock data
        assertEquals("MockCourse", yourClassInstance.getTxtCourseName().getText());
        assertEquals("Lecturer: " + mockCourse.getInstructor(), yourClassInstance.getTxtLecturer().getText());
        assertEquals("Location: " + mockCourse.getLocation(), yourClassInstance.getTxtLocation().getText());

        // Add more assertions as needed for other UI components or data
    }

    @Test
    public void testShowReview() {
        // Create mock data for the StudentService
        when(mockStudentService.getRating(anyString(), anyString())).thenReturn(3);
        when(mockStudentService.getFeedback(anyString(), anyString())).thenReturn("Good course!");

        // Call the method to be tested
        yourClassInstance.showReview("MockCourse");

        // Assert the JComboBox selected index based on the mock rating
        assertEquals(3, yourClassInstance.getTxtCourseRating().getSelectedIndex());

        // Assert the JTextArea text based on the mock feedback
        assertEquals("Good course!", yourClassInstance.getTxtAreaFeedback().getText());

        // Add more assertions as needed for other UI components or data
    }

     @Test
    public void testUpdateRating() {
        // Set up the JComboBox with mock data
        JComboBox<String> mockComboBox = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});
        yourClassInstance.setTxtCourseRating(mockComboBox);

        // Call the method to be tested
        yourClassInstance.updateRating();

        // Assert that the StudentService method was called with the correct parameters
        verify(mockStudentService).rateCourse(anyString(), anyString(), eq(0)); // Assuming 0 is the index for "1"

        // Add more assertions as needed based on the behavior of your code
    }

    @Test
    public void testUpdateFeedback() {
        // Set up the JTextArea with mock data
        JTextArea mockTextArea = new JTextArea("Great course!");
        yourClassInstance.setTxtAreaFeedback(mockTextArea);

        // Call the method to be tested
        yourClassInstance.updateFeedback();

        // Assert that the StudentService method was called with the correct parameters
        verify(mockStudentService).leaveFeeback(anyString(), anyString(), eq("Great course!"));

        // Add more assertions as needed based on the behavior of your code
    }


    // Add more test methods for other functionalities if needed
}
