
package service;

import entety.Course;
import entety.CourseReview;
import entety.CourseSchedule;
import java.util.ArrayList;
import java.util.Collections;
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
    public List getAllReviews(String courseName) {
        
        return courseData.getCourseReviews(courseName);
    }
    public int getNoStudents(String courseName){
       return courseData.getNoStudents(courseName);
    }
    public List getAllFeedback(String courseName) {
        List validFeedbacks=new ArrayList<CourseReview>();
        List<CourseReview> allReviews =courseData.getCourseReviews(courseName);
        
        for(CourseReview review:allReviews){
            if(review.getFeedback()!=null){
                validFeedbacks.add(review);
            }
        }
        return validFeedbacks;
    }
    public double getRating(String courseName){
        updateRating(courseName);
        return courseData.getRating(courseName);
    }
    
}