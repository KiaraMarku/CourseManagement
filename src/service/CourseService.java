package service;

import entety.Course;
import entety.CourseReview;
import entety.CourseSchedule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import repository.CourseData;

public class CourseService {

    CourseData courseData = new CourseData();

    public List getAllCourses() {
        return courseData.getAllCourses();
    }

    public Course getCourseDetails(String courseName) {
        return courseData.getCourse(courseName);
    }

    public List<CourseSchedule> getCourseSchedule(String courseName) {
        return courseData.getCourseSchedule(courseName);
    }

    public List getStudentCourses(String studentName) {
        return courseData.getStudentCourses(studentName);
    }

    public int getNoStudents(String courseName) {
        return courseData.getNoStudents(courseName);
    }

    public List getAllReviews(String courseName) {
        
        return courseData.getCourseReviews(courseName);
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
    
    public void updateRating(String courseName){
        double newRating=courseData.calculateRatingAverage(courseName);
        courseData.updateRating(courseName, newRating);
    }
    
    public Course[] getTopCourses(){
        List<Course> allCourses= courseData.getAllCourses();
        Course[] topCourses=new Course[8];
        
        Collections.sort(allCourses);
        int lastIndex=allCourses.size()-1;
        
        
        for(int i=0;i<8;i++){
            topCourses[i]=allCourses.get(lastIndex-i);
        }
        return topCourses;
    }
    
    public void deleteOldFeedback(){
        new CourseData().deleteOldFeedback();
    }
}
