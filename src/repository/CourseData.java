/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entety.Course;
import entety.CourseReview;
import entety.CourseSchedule;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author arual
 */
public class CourseData {
    
  public List<Course> getAllCourses(){
    List<Course> courses=new ArrayList<Course> ();
          try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(
           "select * from course ");
             ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            int courseID = resultSet.getInt("course_id");
            String courseName = resultSet.getString("course_name");
            String instructor = resultSet.getString("instructor");
            String location = resultSet.getString("location");
            double rating=resultSet.getDouble("rating");
            Course course = new Course(courseID, courseName, instructor, location,rating);
            courses.add(course);
         
        }
       } catch (Exception e) {
           
        e.printStackTrace();

       }
          return courses;
    }
  
    public List<Course> getStudentCourses(String studentName){
    List<Course> courses=new ArrayList<Course> ();
          try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement( "select * from course where course.course_id in (select student_course.course_id from student_course where student_name=? )");
             pst.setString(1, studentName);
             ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            int courseID = resultSet.getInt("course_id");
            String courseName = resultSet.getString("course_name");
            String instructor = resultSet.getString("instructor");
            String location = resultSet.getString("location");
            double rating=resultSet.getDouble("rating");
           
            Course course = new Course(courseID, courseName, instructor, location, rating);
            courses.add(course);
         
        }
       } catch (Exception e) {
           
        e.printStackTrace();

       }
          return courses;
    }

  
    
  
    public Course getCourse(String courseName){
          Course course=null;
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(
           "select * from course where course_name=?");
             pst.setString(1, courseName);
              
             ResultSet resultSet = pst.executeQuery();
        if (resultSet.next()) {
            int courseID = resultSet.getInt("course_id");
            String instructor = resultSet.getString("instructor");
            String location = resultSet.getString("location");
            double rating=resultSet.getDouble("rating");
            course = new Course(courseID, courseName, instructor, location,rating);
          
        }
       } catch (Exception e) {
           
        e.printStackTrace();

       }
          return course;
    }
  
    public List getCourseSchedule(String courseName){
        
       List <CourseSchedule> courseSchedule= new  ArrayList<CourseSchedule>();
         
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(
           "select * from course_schedule where course_id = (select course_id from course where course_name=?)");
            pst.setString(1, courseName);
             ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            
            String meetingDay = resultSet.getString("meeting_day");
            LocalTime startTime = LocalTime.parse(resultSet.getString("start_time"));
            LocalTime endTime = LocalTime.parse(resultSet.getString("end_time"));

            courseSchedule.add(new CourseSchedule(startTime, endTime, meetingDay)); 

         
        }
       } catch (Exception e) {
           
        e.printStackTrace();

       }
          return courseSchedule;
          
    }
    
    public int  getNoStudents( String courseName){
           int studentCount=0;      
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select count(*) from student_course where course_id = (select course_id from course where course_name=?)");
             pst.setString(1,courseName);
             ResultSet resultSet = pst.executeQuery();
          
               if (resultSet.next()) {
                     studentCount = resultSet.getInt(1);
                   }
               
       } catch (Exception e) {
           
        e.printStackTrace();

       }
         return studentCount;
     }
    
    public List getCourseReviews(String courseName){
        List<CourseReview> courseReviews=new ArrayList<CourseReview>();
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("select student_name,rating,feedback,date from student_course "
                    + "where course_id = (select course_id from course where course_name=?) ORDER BY date");
             pst.setString(1,courseName);
             ResultSet resultSet = pst.executeQuery();
          
               while (resultSet.next()) {
                    String studentName = resultSet.getString("student_name"); 
                    int rating=resultSet.getInt("rating");
                    String feedback=resultSet.getString("feedback");
                    Date date=resultSet.getDate("date");
                    if(date!=null){
                        CourseReview review=new CourseReview(rating, studentName, feedback,date);
                        courseReviews.add(review);  
                    }
                }
               
       } catch (Exception e) {
           
        e.printStackTrace();

       }
         return  courseReviews;
    }
    
    
    public double  calculateRatingAverage( String courseName){
           double averageRating=0;      
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT AVG(rating) FROM student_course WHERE course_id = (SELECT course_id FROM course WHERE course_name=?)");
             pst.setString(1,courseName);
             ResultSet resultSet = pst.executeQuery();
          
               if (resultSet.next()) {
                     averageRating = resultSet.getInt(1);
                   }
               
       } catch (Exception e) {
           
        e.printStackTrace();

       }
         return averageRating;
     }  

     public double  getRating( String courseName){
           double rating=0;      
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT rating FROM course WHERE course_name=?");
             pst.setString(1,courseName);
             ResultSet resultSet = pst.executeQuery();
          
               if (resultSet.next()) {
                     rating = resultSet.getDouble("rating");
                   }
               
       } catch (Exception e) {
           
        e.printStackTrace();

       }
         return rating;
     } 
     
     
     public void updateRating(String courseName,double rating){
        
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE course SET rating=? WHERE course_name=?");
             pst.setDouble(1,rating);
             pst.setString(2,courseName);
                      
             pst.executeUpdate();  
               
       } catch (Exception e) {
           
        e.printStackTrace();

       }
          
     }
     
     public void deleteOldFeedback(){
          
            try {
            Connection con = JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE student_course SET feedback=null WHERE date<=CURDATE()- INTERVAL 1 WEEK ");
        ;
           
            pst.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();

        }

     }
         
     
}
