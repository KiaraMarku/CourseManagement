/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package entety;

import java.time.LocalTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arual
 */
public class CourseScheduleTest {
    
    public CourseScheduleTest() {
    }
    
  @Test
public void testCourseScheduleConstructor() {
  // Set test values
  LocalTime startTime = LocalTime.of(10, 00);
  LocalTime endTime = LocalTime.of(11, 00);
  String meetingDay = "Monday";

  // Create new CourseSchedule object
  CourseSchedule schedule = new CourseSchedule(startTime, endTime, meetingDay);

  // Assert values are set correctly
  assertEquals(startTime, schedule.getStartTime());
  assertEquals(endTime, schedule.getEndTime());
  assertEquals(meetingDay, schedule.getMeetingDay());
}
@Test
public void testGetters() {
  // Set test values
  LocalTime startTime = LocalTime.of(9, 30);
  LocalTime endTime = LocalTime.of(10, 30);
  String meetingDay = "Tuesday";

  // Create new CourseSchedule object
  CourseSchedule schedule = new CourseSchedule(startTime, endTime, meetingDay);

  // Assert getter methods return correct values
  assertEquals(startTime, schedule.getStartTime());
  assertEquals(endTime, schedule.getEndTime());
  assertEquals(meetingDay, schedule.getMeetingDay());
}


    
}
