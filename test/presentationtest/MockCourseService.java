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
import entety.CourseSchedule;
import java.util.List;
import service.CourseService;

public class MockCourseService extends CourseService {

    @Override
    public List<Course> getStudentCourses(String username) {
        // Implement this method to return mock data for testing
        return null;
    }

    @Override
    public Course getCourseDetails(String name) {
        // Implement this method to return mock data for testing
        return null;
    }

    @Override
    public List<CourseSchedule> getCourseSchedule(String name) {
        // Implement this method to return mock data for testing
        return null;
    }

    @Override
    public int getNoStudents(String name) {
        // Implement this method to return mock data for testing
        return 0;
    }
    
    // Add other methods from CourseService interface and implement them with mock data
}
