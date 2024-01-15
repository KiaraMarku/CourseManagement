/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entety;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arual
 */
public class CourseReviewTest {

    @Test
    public void testConstructor() {
        Date date = new Date();
        CourseReview review = new CourseReview(5, "Alice", "Great course!", date);
        assertEquals(5, review.getRating());
        assertEquals("Alice", review.getStudentName());
        assertEquals("Great course!", review.getFeedback());
        assertEquals(date, review.getDate());
    }

     @Test
    public void testGetters() {
        Date date = new Date();
        CourseReview review = new CourseReview(5, "Alice", "Great course!", date);
        assertEquals(5, review.getRating());
        assertEquals("Alice", review.getStudentName());
        assertEquals("Great course!", review.getFeedback());
        assertEquals(date, review.getDate());
    }
}
