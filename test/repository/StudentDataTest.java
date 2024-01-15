/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package repository;


import static org.junit.Assert.*;
import entety.Student;
import java.sql.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.any;

import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class StudentDataTest {
    @Mock
    private Connection connection;
    @Mock
    private PreparedStatement preparedStatement;
    @Mock
    private ResultSet resultSet;

    private StudentData studentData;

    @Before
    public void setUp() throws SQLException  {
        MockitoAnnotations.initMocks(this);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedStatement);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);
        studentData = new StudentData();
        JDBConnection.setConnection(connection);
    }

    @Test
    public void testAddStudent() throws SQLException {
        String name = "Test Student";
        String major = "Test Major";
        String password = "Test Password";

        studentData.addStudent(name, major, password);

        verify(preparedStatement).setString(1, name);
        verify(preparedStatement).setString(2, major);
        verify(preparedStatement).setString(3, password);
        verify(preparedStatement).executeUpdate();
    }

    @Test
    public void testContainsStudent() throws SQLException {
        String name = "Test Student";

        when(resultSet.next()).thenReturn(true);

        boolean result = studentData.containsStudent(name);

        assertTrue(result);
    }

    @Test
    public void testValidateStudent() throws SQLException {
        String name = "Test Student";
        String password = "Test Password";

        when(resultSet.next()).thenReturn(true);
        when(resultSet.getInt("student_id")).thenReturn(1);
        when(resultSet.getString("student_name")).thenReturn(name);
        when(resultSet.getString("password")).thenReturn(password);
        when(resultSet.getString("major")).thenReturn("Test Major");

        Student result = studentData.validateStudent(name, password);

        assertNotNull(result);
        assertEquals(name, result.getUsername());
        assertEquals(password, result.getPassword());
    }

    @Test
    public void testJoinCourse() throws SQLException {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";

        studentData.joinCourse(student, courseName);

        verify(preparedStatement).setString(1, student.getUsername());
        verify(preparedStatement).setString(2, courseName);
        verify(preparedStatement).executeUpdate();
    }

    @Test
    public void testDropCourse() throws SQLException {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";

        studentData.dropCourse(student, courseName);

        verify(preparedStatement).setString(1, student.getUsername());
        verify(preparedStatement).setString(2, courseName);
        verify(preparedStatement).executeUpdate();
    }

    @Test
    public void testFollowsCourse() throws SQLException {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";

        when(resultSet.next()).thenReturn(true);

        boolean result = studentData.followsCourse(student, courseName);

        assertTrue(result);
    }
    
    @Test
    public void testSetRating() throws SQLException {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";
        int rating = 5;

        studentData.setRating(student, courseName, rating);

        verify(preparedStatement).setInt(1, rating);
        verify(preparedStatement).setString(2, student.getUsername());
        verify(preparedStatement).setString(3, courseName);
        verify(preparedStatement).executeUpdate();
    }

    @Test
    public void testSetFeedback() throws SQLException {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";
        String feedback = "Great course!";

        studentData.setFeedback(student, courseName, feedback);

        verify(preparedStatement).setString(1, feedback);
        verify(preparedStatement).setString(2, student.getUsername());
        verify(preparedStatement).setString(3, courseName);
        verify(preparedStatement).executeUpdate();
    }

    @Test
    public void testGetRating() throws SQLException {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";
        int mockRating = 5;

        when(resultSet.next()).thenReturn(true);
        when(resultSet.getInt("rating")).thenReturn(mockRating);

        int result = studentData.getRating(student, courseName);

        assertEquals(mockRating, result);
    }

    @Test
    public void testGetFeedback() throws SQLException {
        Student student = new Student();
        student.setUsername("Test Student");
        String courseName = "Test Course";
        String mockFeedback = "Great course!";

        when(resultSet.next()).thenReturn(true);
        when(resultSet.getString("feedback")).thenReturn(mockFeedback);

        String result = studentData.getFeedback(student, courseName);

        assertEquals(mockFeedback, result);
    }


  
   
}

