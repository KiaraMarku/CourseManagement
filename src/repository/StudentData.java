/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entety.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author arual
 */
public class StudentData {
 //performs database queries related to students (register, login,logout,deletaccount)   
    
 public void addStudent(String name,String major,String password){
      
       try {
           Connection con=JDBConnection.getConnection();
   PreparedStatement pst = con.prepareStatement(
           "insert into student(student_name,major,password)values(?,?,?)");
                    pst.setString(1, name);
                    pst.setString(2,major );
                    pst.setString(3,password);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registration Succesfull");
                   
                    
       } catch (Exception e) {
           
        e.printStackTrace();

       }
 }
 
 public boolean containsStudent(String name){
     try {
           Connection con=JDBConnection.getConnection();
           PreparedStatement pst = con.prepareStatement(
           "select * from student where student_name=?");
                   pst.setString(1, name);
                   ResultSet rs = pst.executeQuery();
                   
                if(rs.next()){
                     JOptionPane.showMessageDialog(null, "User alredy exists");
                     return true;
                   }              
       }
       catch(Exception e){
           e.printStackTrace();
       }
       
       return false;
 }  
 
 public Student validateStudent(String name,String password){
     //the return type is student so we can use the information of the student who is to be logedin to personalize the app 
      Student student=null;
      try {
           Connection con=JDBConnection.getConnection();
           PreparedStatement pst = con.prepareStatement(
           "select * from student where student_name=?&&password=?");
                   pst.setString(1, name);
                   pst.setString(2, password);
                   ResultSet rs = pst.executeQuery();
                   
                  
                if(rs.next()){
                     student=new Student();
                     student.setId(rs.getInt("student_id"));
                     student.setUsername(rs.getString("student_name"));
                     student.setPassword(rs.getString("password"));
                     student.setMajor(rs.getString("major"));
                   }              
       }
       catch(Exception e){
           e.printStackTrace();
       }
    
      return student;
 }
   

        
    public void joinCourse(Student student, String courseName){
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO student_course (student_name, course_id) "
                    + "VALUES (?, (SELECT course_id FROM course WHERE course_name = ?))");
                    pst.setString(1, student.getUsername());
                    pst.setString(2,courseName );
              
                    pst.executeUpdate();      
                    
       } catch (Exception e) {
           
        e.printStackTrace();

       }      
            
    }
    
        
    public void dropCourse(Student student, String courseName){
         try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("DELETE FROM student_course WHERE student_name=? AND course_id="
                    + " (SELECT course_id FROM course WHERE course_name = ?)");
                    pst.setString(1, student.getUsername());
                    pst.setString(2,courseName );
              
                    pst.executeUpdate();      
                    
       } catch (Exception e) {
           
        e.printStackTrace();

       }      
            
    }
    
    public boolean followsCourse (Student student,String courseName){
     try {
           Connection con=JDBConnection.getConnection();
           PreparedStatement pst = con.prepareStatement( "SELECT * FROM student_course WHERE student_name=? AND course_id="
                   + " (SELECT course_id FROM course WHERE course_name = ?) " );
                   pst.setString(1, student.getUsername());
                   pst.setString(2,courseName );
                   ResultSet rs = pst.executeQuery();
                   
                if(rs.next()){
         
                     return true;
                   }              
       }
       catch(Exception e){
           e.printStackTrace();
       }
       
       return false;
   }  
    
    public void setRating(Student student,String courseName,int rating){
          try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE   student_course SET rating=?,date=CURDATE() WHERE student_name=? AND course_id="
                    + " (SELECT course_id FROM course WHERE course_name = ?)");
                    pst.setInt(1,rating ); 
                    pst.setString(2, student.getUsername());
                    pst.setString(3,courseName );
              
                    pst.executeUpdate();      
                    
       } catch (Exception e) {
           
        e.printStackTrace();

       }     
    }
    
    public void setFeedback(Student student,String courseName,String feedback){
          try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE student_course SET feedback=?,date=CURDATE() WHERE student_name=? AND course_id="
                    + " (SELECT course_id FROM course WHERE course_name = ?)");
                    pst.setString(1,feedback); 
                    pst.setString(2, student.getUsername());
                    pst.setString(3,courseName );
              
                    pst.executeUpdate();      
                    
       } catch (Exception e) {
           
        e.printStackTrace();

       }     
    }
    
    
     public int getRating(Student student,String courseName){
         int rating=0;
          try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT rating FROM student_course WHERE student_name=? AND course_id="
                    + " (SELECT course_id FROM course WHERE course_name = ?)");
                   
                    pst.setString(1, student.getUsername());
                    pst.setString(2,courseName );
              
                     ResultSet resultSet = pst.executeQuery();
          
                    if (resultSet.next()) {
                        rating= resultSet.getInt("rating");
                    }
              
            } catch (Exception e) {

             e.printStackTrace();

            }
          return rating;
    }
    
    public String getFeedback(Student student,String courseName){
        String feedback=null;
       try {
           Connection con=JDBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT feedback FROM student_course WHERE student_name=? AND course_id="
                    + " (SELECT course_id FROM course WHERE course_name = ?)");
                   
                    pst.setString(1, student.getUsername());
                    pst.setString(2,courseName );
              
                     ResultSet resultSet = pst.executeQuery();
          
                    if (resultSet.next()) {
                        feedback   = resultSet.getString("feedback");
                    }
              
            }  catch (Exception e) {

                e.printStackTrace();
               } 
       return feedback;
    }
    
}
