/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import repository.StudentData;
import entety.Student;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import repository.CourseData;

/**
 *
 * @author arual
 */
public class StudentService {
    
    StudentData studentData;
    CourseData courseData;

    public StudentService() {
    studentData=new StudentData();
    courseData=new CourseData();
    }
    
     public StudentService(StudentData s,CourseData c) {
    studentData=s;
    courseData=c;
    }
     
  public void register(String name,String major,String password){
       password=hash(password);
      studentData.addStudent(name, major, password);
  }
  
  public boolean validateRegister(String name,String major,String password,String config){
      
      if(name.equals("")){
           JOptionPane.showMessageDialog(null, "Please insert name");
           return false;
       }
        if(major.equals("")){
           JOptionPane.showMessageDialog(null, "Please insert major");
           return false;
       }
         if(password.equals("")){
           JOptionPane.showMessageDialog(null, "Please insert password");
           return false;
       }
          if(!password.equals(config)){
           JOptionPane.showMessageDialog(null, "Password does not match");
           return false;
       }
          
       return true;
           
  }

    public boolean userExists(String name) {
     return studentData.containsStudent(name);
    }
    
     public boolean validateLogIn(String name,String password){
      
       
       if(name.equals("")){
           JOptionPane.showMessageDialog(null, "Please insert name");
           return false;
       }
       
         if(password.equals("")){
           JOptionPane.showMessageDialog(null, "Please insert password");
           return false;
       }
         return true;
    }
     
     public Student validateStudent(String name,String password){
                password=hash(password);
             Student student=studentData.validateStudent(name, password);
                if(student!=null){
                     JOptionPane.showMessageDialog(null, "Welcome " +name); 
                   }              
                else  JOptionPane.showMessageDialog(null, "Login unsuccesfull");
                return student;
     }
     
     public void joinCourse(Student student, String coursename){
         studentData.joinCourse(student, coursename);
     }
     
      public void dropCourse(Student student, String coursename){
         studentData.dropCourse(student, coursename);
     }
      
      public boolean followsCourses(Student student, String coursename){
          return studentData.followsCourse(student, coursename);
      }
      
      
      public void rateCourse(Student student,String courseName,int rating){
          studentData.setRating(student, courseName, rating);
          courseData.updateRating(courseName, rating);
          
      }
      
       public void leaveFeeback(Student student,String courseName,String feedback){
          studentData.setFeedback(student, courseName, feedback);
      }
       
       public int getRating(Student student,String courseName){
           return studentData.getRating(student, courseName);
       }
       
        
       public String getFeedback(Student student,String courseName){
           return studentData.getFeedback(student, courseName);
       }
       
       public static String hash (String password) {
        try {
         MessageDigest messageDigest = MessageDigest.getInstance("MD5");

         messageDigest.update(password.getBytes());

         byte[] resultByteArray = messageDigest.digest();

         StringBuilder sb = new StringBuilder();

         for (byte b : resultByteArray) {
          sb.append(String.format("%02x", b));
         }

         return sb.toString();

        } catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
        }

        return "";
       }
 
}
