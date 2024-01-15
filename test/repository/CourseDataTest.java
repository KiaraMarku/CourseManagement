/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package repository;

import entety.Course;
import entety.CourseReview;
import entety.CourseSchedule;
import java.sql.*;
import java.time.LocalTime;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;




import static org.mockito.Mockito.*;

public class CourseDataTest {
    @Mock
    private Connection connection;
    @Mock
    private PreparedStatement preparedStatement;
    @Mock
    private ResultSet resultSet;

    @Before
    public void setUp() throws SQLException  {
        MockitoAnnotations.initMocks(this);
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedStatement);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);
    }

    @Test
    public void testGetAllCourses() throws SQLException  {   
        when(resultSet.next()).thenReturn(true, false); 
        when(resultSet.getInt("course_id")).thenReturn(1);
        when(resultSet.getString("course_name")).thenReturn("Course 1");
        when(resultSet.getString("instructor")).thenReturn("Instructor 1");
        when(resultSet.getString("location")).thenReturn("Location 1");
        when(resultSet.getDouble("rating")).thenReturn(4.5);
        CourseData courseData = new CourseData();
        JDBConnection.setConnection(connection); 
        List<Course> courses = courseData.getAllCourses();
        assertEquals(1, courses.size());
        Course course = courses.get(0);
        assertEquals(1, course.getId());
        assertEquals("Course 1", course.getName());
        assertEquals("Instructor 1", course.getInstructor());
        assertEquals("Location 1", course.getLocation());
        assertEquals(4.5, course.getRating(), 0.01);
    }

    @Test
    public void testGetStudentCourses() throws Exception {
        when(resultSet.next()).thenReturn(true, false); // Simulate one row in the result set
        when(resultSet.getInt("course_id")).thenReturn(1);
        when(resultSet.getString("course_name")).thenReturn("Course 1");
        when(resultSet.getString("instructor")).thenReturn("Instructor 1");
        when(resultSet.getString("location")).thenReturn("Location 1");
        when(resultSet.getDouble("rating")).thenReturn(4.5);

        CourseData courseData = new CourseData();
        JDBConnection.setConnection(connection); // Assuming you have a setConnection method in JDBConnection class
        List<Course> courses = courseData.getStudentCourses("student1");
        assertEquals(1, courses.size());
        Course course = courses.get(0);
        assertEquals(1, course.getId());
        assertEquals("Course 1", course.getName());
        assertEquals("Instructor 1", course.getInstructor());
        assertEquals("Location 1", course.getLocation());
        assertEquals(4.5, course.getRating(), 0.01);
    }

    @Test
    public void testGetCourse() throws Exception {
        when(resultSet.next()).thenReturn(true); // Simulate one row in the result set
        when(resultSet.getInt("course_id")).thenReturn(1);
        when(resultSet.getString("course_name")).thenReturn("Course 1");
        when(resultSet.getString("instructor")).thenReturn("Instructor 1");
        when(resultSet.getString("location")).thenReturn("Location 1");
        when(resultSet.getDouble("rating")).thenReturn(4.5);

        CourseData courseData = new CourseData();
        JDBConnection.setConnection(connection); // Assuming you have a setConnection method in JDBConnection class
        Course course = courseData.getCourse("Course 1");
        assertEquals(1, course.getId());
        assertEquals("Course 1", course.getName());
        assertEquals("Instructor 1", course.getInstructor());
        assertEquals("Location 1", course.getLocation());
       assertEquals(4.5, course.getRating(), 0.01);
    }
    
    @Test
public void testGetCourseSchedule() throws SQLException {
    when(resultSet.next()).thenReturn(true, false);
    when(resultSet.getString("meeting_day")).thenReturn("Monday");
    when(resultSet.getString("start_time")).thenReturn("09:00");
    when(resultSet.getString("end_time")).thenReturn("10:00");

    CourseData courseData = new CourseData();
    JDBConnection.setConnection(connection);

    List<CourseSchedule> courseSchedules = courseData.getCourseSchedule("Test Course");
    assertEquals(1, courseSchedules.size());

    CourseSchedule courseSchedule = courseSchedules.get(0);
    assertEquals("Monday", courseSchedule.getMeetingDay());
    assertEquals(LocalTime.of(9, 0), courseSchedule.getStartTime());
    assertEquals(LocalTime.of(10, 0), courseSchedule.getEndTime());
}

@Test
public void testGetNoStudents() throws SQLException {
    when(resultSet.next()).thenReturn(true);
    when(resultSet.getInt(1)).thenReturn(10);

    CourseData courseData = new CourseData();
    JDBConnection.setConnection(connection);

    int noStudents = courseData.getNoStudents("Test Course");
    assertEquals(10, noStudents);
}

@Test
public void testGetCourseReviews() throws SQLException {
    when(resultSet.next()).thenReturn(true, false);
    when(resultSet.getString("student_name")).thenReturn("Test Student");
    when(resultSet.getInt("rating")).thenReturn(5);
    when(resultSet.getString("feedback")).thenReturn("Great course!");
    when(resultSet.getDate("date")).thenReturn(java.sql.Date.valueOf("2022-01-01"));

    CourseData courseData = new CourseData();
    JDBConnection.setConnection(connection);

    List<CourseReview> courseReviews = courseData.getCourseReviews("Test Course");
    assertEquals(1, courseReviews.size());

    CourseReview courseReview = courseReviews.get(0);
    assertEquals("Test Student", courseReview.getStudentName());
    assertEquals(5, courseReview.getRating());
    assertEquals("Great course!", courseReview.getFeedback());
    assertEquals(java.sql.Date.valueOf("2022-01-01"), courseReview.getDate());
}

@Test
public void testCalculateRatingAverage() throws SQLException {
    when(resultSet.next()).thenReturn(true);
    when(resultSet.getDouble(1)).thenReturn(4.5);

    CourseData courseData = new CourseData();
    JDBConnection.setConnection(connection);

    double averageRating = courseData.calculateRatingAverage("Test Course");
    assertEquals(4.5, averageRating, 0.01);
}
@Test
public void testUpdateRating() throws SQLException {
    String courseName = "Test Course"; // Replace this with a course name that exists in your CourseData
    double rating = 4.5;

    CourseData courseData = new CourseData();
    JDBConnection.setConnection(connection);

    courseData.updateRating(courseName, rating);

    verify(preparedStatement).setDouble(1, rating);
    verify(preparedStatement).setString(2, courseName);
    verify(preparedStatement).executeUpdate();
}

@Test
public void testDeleteOldFeedback() throws SQLException {
    CourseData courseData = new CourseData();
    JDBConnection.setConnection(connection);

    courseData.deleteOldFeedback();

    verify(preparedStatement).executeUpdate();
}

@Test
public void testGetStudentCourseSchedule() throws SQLException {
    when(resultSet.next()).thenReturn(true, false);
    when(resultSet.getString("course_name")).thenReturn("Test Course");
    when(resultSet.getString("meeting_day")).thenReturn("Monday");
    when(resultSet.getString("start_time")).thenReturn("09:00");
    when(resultSet.getString("end_time")).thenReturn("10:00");

    CourseData courseData = new CourseData();
    JDBConnection.setConnection(connection);

    List<Course> studentSchedule = courseData.getStudentCourseSchedule("Test Student");
    assertEquals(1, studentSchedule.size());

    Course course = studentSchedule.get(0);
    assertEquals("Test Course", course.getName());
    assertEquals("Monday", course.getMeetingDay());
    assertEquals(LocalTime.of(9, 0), course.getStartTime());
    assertEquals(LocalTime.of(10, 0), course.getEndTime());
}


}

