package presentationtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import presentation.Login;

public class LoginTest {

    private Login login;

    @BeforeEach
public void setUp() {
    // Initialize the Login instance before each test
    login = new Login();
    // Initialize the user field (adjust based on your actual data)
    login.user = new User();
}
    @Test
    public void testValidateLogIn() {
        // Set valid values to the text fields
        login.txtName.setText("ValidName");
        login.txtPassword.setText("ValidPassword");

        // Call the validateLogIn method
        boolean result = login.validateLogIn();

        // Assert that the result is true for valid input
        assertTrue(result);
    }

    @Test
    public void testValidateUser() {
        // Set valid values to the text fields
        login.txtName.setText("ValidName");
        login.txtPassword.setText("ValidPassword");

        // Call the validateUser method
        boolean result = login.validateUser();

        // Assert that the result is true for valid input
        assertTrue(result);
        // Assert that the user object is not null (you may need to adjust based on your actual data)
        assertNotNull(login.user);
    }

    @Test
    public void testValidateUserInvalid() {
        // Set invalid values to the text fields
        login.txtName.setText("InvalidName");
        login.txtPassword.setText("InvalidPassword");

        // Call the validateUser method
        boolean result = login.validateUser();

        // Assert that the result is false for invalid input
        assertFalse(result);
        // Assert that the user object is null for invalid input
        assertNull(login.user);
    }

    @Test
    public void testValidateUserEmptyFields() {
        // Set empty values to the text fields
        login.txtName.setText("");
        login.txtPassword.setText("");

        // Call the validateUser method
        boolean result = login.validateUser();

        // Assert that the result is false for empty input
        assertFalse(result);
        // Assert that the user object is null for empty input
        assertNull(login.user);
    }
    
    public class User {
    private String username;
    private String password;

    // Constructors, getters, and setters

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

        private User() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    }

}
