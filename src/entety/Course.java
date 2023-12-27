/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entety;

import java.util.List;



public class Course {
 
    int id;
    String  name;
    String instructor;
    String location;
    int rating;
    List<CourseReview> reviews;
    
    public Course() {
    }
    
    public Course(int id, String name, String instructor, String location, int rating) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.location = location;
        this.rating = rating;
       
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

   
    public int getRating() {
        return rating;
    }

}
