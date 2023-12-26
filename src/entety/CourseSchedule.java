
package entety;

import java.time.LocalTime;

     public class CourseSchedule{
        LocalTime startTime;
        LocalTime endTime;
        String meetingDay;

        public CourseSchedule(LocalTime startTime, LocalTime endTime, String meetingDay) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.meetingDay = meetingDay;
        }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getMeetingDay() {
        return meetingDay;
    }
        
        
    } 

