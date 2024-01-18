/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentationtest;

import entety.Student;
import java.awt.event.MouseEvent;
import presentation.TopCourses;

/**
 *
 * @author Dell
 */
public class TestTopCourses {
    public static void main(String[] args) {
        // Create a sample student
        Student sampleStudent = new Student("SampleUser", "SamplePassword");

        // Create an instance of your TopCourses class
        TopCourses topCourses = new TopCourses(sampleStudent);

  

       
        topCourses.tblCourse.setRowSelectionInterval(0, 0);
        topCourses.tblCourseMouseClicked(new MouseEvent(
                topCourses.tblCourse, MouseEvent.MOUSE_CLICKED,
                System.currentTimeMillis(), 0, 0, 0, 1, false
        ));
        

       
        topCourses.btnJoinDrop.doClick();
    

        // Add more test scenarios as needed
        // ...

        // Note: Make sure to handle any exceptions that might occur during testing
    
    }
}
