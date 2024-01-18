/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentationtest;

/**
 *
 * @author Dell
 */
import static org.junit.Assert.*;
import org.junit.*;

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import entety.Student;

import javax.swing.*;

import org.fest.swing.core.GenericTypeMatcher;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.fixture.FrameFixture;

public class BrowseCoursesTest {

    private FrameFixture window;

    @Before
    public void setUp() throws Exception {
        try {
            UIManager.setLookAndFeel(new NimRODLookAndFeel());
            NimRODTheme nt = new NimRODTheme("/theme.xml");
            NimRODLookAndFeel nlf = new NimRODLookAndFeel();
            nlf.setCurrentTheme(nt);
            UIManager.setLookAndFeel(nlf);
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        BrowseCourses browseCourses = GuiActionRunner.execute(() -> new BrowseCourses(new Student())); // Assuming you have a default constructor in BrowseCourses
        window = new FrameFixture(browseCourses);
        window.show(); // shows the frame to test
    }

    @After
    public void tearDown() throws Exception {
        window.cleanUp();
    }

    @Test
    public void testBrowseCoursesButton() {
        // Assuming there's a button named "browseCourses"
        window.button("browseCourses").click();

        // Add assertions or further tests based on the expected behavior
    }

    @Test
    public void testJoinDropButton() {
        // Assuming there's a button named "btnJoinDrop"
        window.button("btnJoinDrop").click();

        // Add assertions or further tests based on the expected behavior
    }

    @Test
    public void testLogoutButton() {
        // Assuming there's a button named "logout"
        window.button("logout").click();

        // Add assertions or further tests based on the expected behavior
    }

    @Test
    public void testTableSelection() {
        // Assuming there's a table named "tblCourse"
        window.table("tblCourse").selectRows(0); // Select the first row

        // Add assertions or further tests based on the expected behavior
    }
}

