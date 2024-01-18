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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import presentation.Home;

public class HomeTest {

    @Test
    public void testUsernameSetting() {
        // Create a dummy Student object for testing
        Student dummyUser = new Student("DummyUser", "TestPassword");

        // Create an instance of the Home class
        Home home = new Home(dummyUser);

        // Check if the username label is set correctly
        assertEquals("DummyUser", home.txtUsername.getText());
    }

    // Add more test methods as needed to cover other functionalities

}
