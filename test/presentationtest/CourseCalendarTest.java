/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentationtest;

/**
 *
 * @author Dell
 */
import entety.Course;
import entety.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import service.CourseService;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import presentation.CourseCalendar;

public class CourseCalendarTest {

    @Mock
    private CourseService courseServiceMock;

    private CourseCalendar courseCalendar;

    @Before
    public void setUp() throws NoSuchFieldException, IllegalAccessException {
        MockitoAnnotations.initMocks(this);
        Student user = new Student("DummyUser", "TestPassword"); // You may need to provide necessary details for Student

        // Inject the mock into the CourseCalendar class using reflection
        courseCalendar = new CourseCalendar(user);
        setPrivateField(courseCalendar, "courseService", courseServiceMock);
    }

    @After
    public void tearDown() {
        courseCalendar.dispose();
    }

    @Test
    public void testShowCalendar() {
        // Assuming you have a list of dummy courses for testing
        when(courseServiceMock.getStudentSchedule(anyString())).thenReturn(createDummyCourses());

        // Call the method to be tested
        courseCalendar.showCalendar();

        // Verify that the method was called with the correct arguments
        verify(courseServiceMock).getStudentSchedule(anyString());

        // Add additional assertions based on the expected behavior of your showCalendar method
        // For example, you can assert that the table model has been updated correctly
    }

    private List<Course> createDummyCourses() {
        // Create and return a list of dummy courses for testing
        // Customize this method based on your actual Course class and requirements
        return Arrays.asList(new Course("Course1"),
                new Course("Course2")
                // Add more dummy courses as needed
                );
    }

    private void setPrivateField(Object target, String fieldName, Object value)
            throws NoSuchFieldException, IllegalAccessException {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
        field.setAccessible(false);
    }
}
