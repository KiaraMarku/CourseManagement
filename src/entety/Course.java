/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entety;

import java.time.LocalTime;
import java.util.List;

public class Course implements Comparable{

    int id;
    String name;
    String instructor;
    String location;
    double rating;
    CourseSchedule schedule;

    public Course() {
    }

    public Course(int id, String name, String instructor, String location, double rating) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.location = location;
        this.rating = rating;

    }
    
    public Course(String name, CourseSchedule schedule){
        this.name=name;
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

    public double getRating() {
        return rating;
    }
    
     public LocalTime getStartTime() {
        return schedule.startTime;
    }

    public LocalTime getEndTime() {
        return schedule.endTime;
    }

    public String getMeetingDay() {
        return schedule.meetingDay;
    }
    @Override
    public int compareTo(Object o) {
      Course  course=(Course)o;
      return (int)(this.rating-course.rating);
    }

}
