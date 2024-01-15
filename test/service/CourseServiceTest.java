/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package service;


import static org.mockito.Mockito.*;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import org.junit.Test;


import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import entety.Course;
import entety.CourseReview;
import entety.CourseSchedule;
import java.util.ArrayList;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import repository.CourseData;


public class CourseServiceTest {

    @Mock
    private CourseData courseDataMock;

    private CourseService courseService;

    @Before
   public void setUp() {
       MockitoAnnotations.initMocks(this);
       courseService = new CourseService(courseDataMock);
    }

    @Test
    public void getAllCourses() {
        List<Course> mockCourses = List.of(
                new Course(1, "Course 1", "Instructor 1", "Location 1", 4.5),
                new Course(2, "Course 2", "Instructor 2", "Location 2", 3.8)
        );
        when(courseDataMock.getAllCourses()).thenReturn(mockCourses);

        List<Course> courses = courseService.getAllCourses();

        assertEquals(mockCourses, courses);
    }

    @Test
    public void getCourseDetails() {
        Course mockCourse = new Course(1, "Course 1", "Instructor 1", "Location 1", 4.5);
        when(courseDataMock.getCourse("Course 1")).thenReturn(mockCourse);

        Course course = courseService.getCourseDetails("Course 1");

        assertEquals(mockCourse, course);
    }

    @Test
    public void getCourseSchedule() {
        CourseSchedule mockSchedule = new CourseSchedule(LocalTime.of(10, 00), LocalTime.of(12, 00), "Monday, Wednesday");
        Course mockCourseWithSchedule = new Course("Course 1", mockSchedule);
        when(courseDataMock.getCourseSchedule("Course 1")).thenReturn((List) mockCourseWithSchedule);

        List<CourseSchedule> schedule = courseService.getCourseSchedule("Course 1");

        assertEquals(Collections.singletonList(mockSchedule), schedule);
    }

    @Test
    public void getStudentCourses() {
        List<Course> mockCourses = List.of(new Course(1, "Course A", "Instructor A", "Location A", 4.0));
        when(courseDataMock.getStudentCourses("Student 1")).thenReturn(mockCourses);

        List<Course> courses = courseService.getStudentCourses("Student 1");

        assertEquals(mockCourses, courses);
    }

    @Test
    public void getNoStudents() {
        int expectedStudents = 10;
        when(courseDataMock.getNoStudents("Course 1")).thenReturn(expectedStudents);

        int students = courseService.getNoStudents("Course 1");

        assertEquals(expectedStudents, students);
    }
     
    @Test
    public void  getAllReviews() {
        List<CourseReview> mockReviews = List.of(
                new CourseReview(5, "Alice", "Great course!",new Date()),
                new CourseReview(4, "Bob", "Helpful content", new Date())
        );
        when(courseDataMock.getCourseReviews("Course 1")).thenReturn(mockReviews);

        List<CourseReview> reviews = courseService.getAllReviews("Course 1");

        assertEquals(mockReviews, reviews);
    }
    
    @Test
    public void testGetAllFeedback() {
        String courseName = "Test Course";
        List<CourseReview> mockReviews = new ArrayList<>();
        mockReviews.add(new CourseReview(5, "Test Student", "Great course!", new Date()));

        when(courseDataMock.getCourseReviews(courseName)).thenReturn(mockReviews);

        List<CourseReview> result = courseService.getAllFeedback(courseName);

        assertEquals(mockReviews.size(), result.size());
    }

    @Test
    public void testGetRating() {
        String courseName = "Test Course";
        double mockRating = 4.5;

        when(courseDataMock.calculateRatingAverage(courseName)).thenReturn(mockRating);

        double result = courseService.getRating(courseName);

        assertEquals(mockRating, result, 0.01);
    }

    @Test
    public void testUpdateRating() {
        String courseName = "Test Course";
        double mockRating = 4.5;

        when(courseDataMock.calculateRatingAverage(courseName)).thenReturn(mockRating);

        courseService.updateRating(courseName);

        verify(courseDataMock).updateRating(courseName, mockRating);
    }

    @Test
    public void testGetTopCourses() {
        List<Course> mockCourses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mockCourses.add(new Course());
        }

        when(courseDataMock.getAllCourses()).thenReturn(mockCourses);

        Course[] result = courseService.getTopCourses();

        assertEquals(8, result.length);
    }

 
}
  
   


