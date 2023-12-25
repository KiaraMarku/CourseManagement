/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entety;

import java.util.Date;

/**
 *
 * @author arual
 */
public class CourseReview {

    int rating;
    String studentName;
    String feedback;
    Date date;

    public CourseReview(int rating, String studentName, String feedback, Date date) {
        this.rating = rating;
        this.studentName = studentName;
        this.feedback = feedback;
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getFeedback() {
        return feedback;
    }

    public Date getDate() {
        return date;
    }

}
