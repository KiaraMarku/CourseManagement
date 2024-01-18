/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentationtest;

/**
 *
 * @author Dell
 */
import entety.Student;
import org.junit.Before;
import org.junit.Test;
import presentation.Reviews;

public class ReviewsTest {

    private Student testStudent;
    private Reviews reviewsPage;

    @Before
    public void setUp() {
        // You can customize this setup for your test
        testStudent = new Student("TestUser", "TestPassword");
        reviewsPage = new Reviews(testStudent, "TestCourse");
    }

    @Test
    public void testShowAllReviews() {
        // Assuming showAllReviews() method populates the table model
        reviewsPage.showAllReviews();
        // Add assertions to check if the table model is populated correctly
    }

    @Test
    public void testShowFeedback() {
        // Assuming showFeedback() method updates the feedback panel
        // You may need to modify this test based on your actual implementation
        reviewsPage.showFeedback("TestReviewer");
        // Add assertions to check if the feedback panel is updated correctly
    }

    // Add more test methods based on the functionality of your Reviews class
    // For example, you may want to test the action listeners, navigation, etc.
}
