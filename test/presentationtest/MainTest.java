/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentationtest;

/**
 *
 * @author Dell
 */
import org.junit.Test;
import static org.junit.Assert.*;
import presentation.Login;

public class MainTest {

    @Test
    public void testLoginInstantiation() {
        try {
            // Attempt to instantiate the Login class
            Login logInPage = new Login();

            // If the instantiation is successful, the test passes
            assertNotNull(logInPage);
        } catch (Exception e) {
            // If an exception occurs during instantiation, the test fails
            fail("Failed to instantiate Login: " + e.getMessage());
        }
    }
}
