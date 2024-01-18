package presentationtest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import presentation.Register;

public class RegisterTest {

    private Register register;

    @BeforeEach
    public void setUp() {
        // Initialize the Register instance before each test
        register = new Register();
    }

    @Test
    public void testReset() {
        // Set some values to the text fields
        register.txtName.setText("TestName");
        register.txtMajor.setSelectedIndex(1);
        register.txtPassword.setText("TestPassword");
        register.txtPasswordConfig.setText("TestPassword");

        // Call the reset method
        register.reset();

        // Assert that the text fields are reset to empty or default values
        assertEquals("", register.txtName.getText());
        assertEquals(0, register.txtMajor.getSelectedIndex());
        assertEquals("", register.txtPassword.getText());
        assertEquals("", register.txtPasswordConfig.getText());
    }

    @Test
    public void testValidateRegister() {
        // Set valid values to the text fields
        register.txtName.setText("ValidName");
        register.txtMajor.setSelectedIndex(1);
        register.txtPassword.setText("ValidPassword");
        register.txtPasswordConfig.setText("ValidPassword");

        // Call the validateRegister method
        boolean result = register.validateRegister();

        // Assert that the result is true for valid input
        assertTrue(result);
    }

    @Test
    public void testUserExists() {
        // Set a known username to the text field
        register.txtName.setText("ExistingUser");

        // Call the userExists method
        boolean result = register.userExists();

        // Assert that the result is false for an unknown user (you may need to adjust based on your actual data)
        assertFalse(result);
    }
}
