/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enteties;

import enteties.Student;
import java.time.LocalTime;
import java.util.List;



/**
 *
 * @author arual
 */
public class Course {
    
    
    public class CourseSchedule{
        LocalTime startTime;
        LocalTime endTime;
        String meetingDay;
        
        
    }
    
    int id;
    String  name;
    String instructor;
    String location;
    int rating;
    CourseSchedule schedule;
    List<String> reviews;
    List <Student> students;
    
    

    public Course() {
    }

    public Course(int id, String name, String instructor, String location, CourseSchedule schedule) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.location = location;
        this.schedule=schedule;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getLocation() {
        return location;
    }

    public CourseSchedule getSchedule() {
        return schedule;
    }

    public int getRating() {
        return rating;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }
    
    
    
    
    
}
