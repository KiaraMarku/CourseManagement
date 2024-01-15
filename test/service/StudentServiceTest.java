/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package service;

import entety.Student;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import repository.CourseData;
import repository.StudentData;


public class StudentServiceTest {
    @Mock
    private StudentData studentDataMock;
    @Mock
    private CourseData courseDataMock;

    private StudentService studentService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        studentService = new StudentService(studentDataMock, courseDataMock);
    }

    @Test
    public void testRegister() {
        String name = "Test Student";
        String major = "Test Major";
        String password = "Test Password";

        studentService.register(name, major, password);

        verify(studentDataMock).addStudent(eq(name), eq(major), anyString());
    }

    @Test
    public void testUserExists() {
        String name = "Test Student";

        when(studentDataMock.containsStudent(name)).thenReturn(true);

        boolean result = studentService.userExists(name);

        assertTrue(result);
    }

    @Test
    public void testValidateStudent() {
        String name = "Test Student";
        String password = "Test Password";
        Student mockStudent = new Student();

        when(studentDataMock.validateStudent(eq(name), anyString())).thenReturn(mockStudent);

        Student result = studentService.validateStudent(name, password);

        assertEquals(mockStudent, result);
    }

    @Test
    public void testJoinCourse() {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";

        studentService.joinCourse(student, courseName);

        verify(studentDataMock).joinCourse(student, courseName);
    }

    @Test
    public void testDropCourse() {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";

        studentService.dropCourse(student, courseName);

        verify(studentDataMock).dropCourse(student, courseName);
    }

    @Test
    public void testFollowsCourses() {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";

        when(studentDataMock.followsCourse(student, courseName)).thenReturn(true);

        boolean result = studentService.followsCourses(student, courseName);

        assertTrue(result);
    }

    @Test
    public void testRateCourse() {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";
        int rating = 5;

        studentService.rateCourse(student, courseName, rating);

        verify(studentDataMock).setRating(student, courseName, rating);
        verify(courseDataMock).updateRating(courseName, rating);
    }

    @Test
    public void testLeaveFeedback() {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";
        String feedback = "Great course!";

        studentService.leaveFeeback(student, courseName, feedback);

        verify(studentDataMock).setFeedback(student, courseName, feedback);
    }
    
    @Test
    public void testGetRating() {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";
        int mockRating = 5;

        when(studentDataMock.getRating(student, courseName)).thenReturn(mockRating);

        int result = studentService.getRating(student, courseName);

        assertEquals(mockRating, result);
    }
     

    @Test
    public void testGetFeedback() {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";
        String mockFeedback = "Great course!";

        when(studentDataMock.getFeedback(student, courseName)).thenReturn(mockFeedback);

        String result = studentService.getFeedback(student, courseName);

        assertEquals(mockFeedback, result);
    }
}
