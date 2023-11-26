/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import Repositories.StudentData;
import enteties.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author arual
 */
public class StudentService {
    
    StudentData studentData=new Repositories.StudentData();
    
  
  public void register(String name,String major,String password){
      
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
             Student student=studentData.validateStudent(name, password);
                if(student!=null){
                     JOptionPane.showMessageDialog(null, "Welcome " +name); 
                   }              
                else  JOptionPane.showMessageDialog(null, "Login unsuccesfull");
                return student;
     }
}
