/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entety;

import java.time.LocalTime;
import org.junit.Test;
import static org.junit.Assert.*;

public class CourseTest {

    @Test
    public void testConstructorWithAllFields() {
        Course course = new Course(1, "Java Programming", "John Smith", "Room 101", 4.5);
        assertEquals(1, course.getId());
        assertEquals("Java Programming", course.getName());
        assertEquals("John Smith", course.getInstructor());
        assertEquals("Room 101", course.getLocation());
        assertEquals(4.5, course.getRating(), 0.001);
    }

    @Test
    public void testConstructorWithNameAndSchedule() {
        CourseSchedule schedule = new CourseSchedule(LocalTime.of(9, 0), LocalTime.of(10, 30), "Monday");
        Course course = new Course("Java Programming", schedule);
        assertEquals("Java Programming", course.getName());
        assertEquals(LocalTime.of(9, 0), course.getStartTime());
        assertEquals(LocalTime.of(10, 30), course.getEndTime());
        assertEquals("Monday", course.getMeetingDay());
    }

    @Test
    public void testCompareTo() {
        Course course1 = new Course(1, "Java Programming", "John Smith", "Room 101", 4.0);
        Course course2 = new Course(2, "Python Programming", "Jane Doe", "Room 202", 4.5);
        assertTrue(course1.compareTo(course2) < 0);
        assertTrue(course2.compareTo(course1) > 0);
    }

}
