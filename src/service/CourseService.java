
package service;

import entety.Course;
import entety.CourseSchedule;
import java.util.List;
import repository.CourseData;


public class CourseService {
    CourseData courseData=new CourseData();
    
    public List getAllCourses(){
        return courseData.getAllCourses();
    }
    
    public Course getCourseDetails(String courseName){
        return courseData.getCourse(courseName);
    }   
    
    public List<CourseSchedule> getCourseSchedule(String courseName){
        return courseData.getCourseSchedule(courseName);
    }  
    
    public int getNoStudents(String courseName){
       return courseData.getNoStudents(courseName);
    }
}
