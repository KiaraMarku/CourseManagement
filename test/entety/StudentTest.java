/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entety;


import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arual
 */

public class StudentTest {

    @Test
    public void testConstructorWithIdUsernamePasswordMajor() {
        int id = 123;
        String username = "johndoe";
        String password = "secret123";
        String major = "Computer Science";

        Student student = new Student(id, username, password, major);

        assertEquals(id, student.getId());
        assertEquals(username, student.getUsername());
        assertEquals(password, student.getPassword());
        assertEquals(major, student.getMajor());
    }

    @Test
    public void testGettersAndSetters() {
        Student student = new Student(1, "john123", "password", "Computer Science");
        student.setId(2);
        student.setUsername("jane456");
        student.setPassword("newpassword");
        student.setMajor("Art History");
        List<Course> courses = List.of(new Course()); // Create a mock course list
        student.setCourses(courses);
        assertEquals(2, student.getId());
        assertEquals("jane456", student.getUsername());
        assertEquals("newpassword", student.getPassword());
        assertEquals("Art History", student.getMajor());
        assertSame(courses, student.getCourses()); // Assert courses are the same object
    }


    
}

