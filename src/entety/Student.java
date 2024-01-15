/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entety;

import java.util.List;


public class Student {
    int id;
    String username;
    String password;
    String major;
    List<Course> courses;

    public Student() {
    }

    public Student(int id, String username, String password, String major) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMajor() {
        return major;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
   
    public void setPassword(String password) {
        this.password = password;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public List getCourses(){
    return courses;
    }
}
