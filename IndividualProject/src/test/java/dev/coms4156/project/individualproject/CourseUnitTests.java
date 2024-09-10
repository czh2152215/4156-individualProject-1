package dev.coms4156.project.individualproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;


/**
 * course unit tests.
 */
@ContextConfiguration
public class CourseUnitTests {

  @BeforeAll
  public static void setupCourseForTesting() {
    testCourse = new Course("Griffin Newbold", "417 IAB", "11:40-12:55", 250);
  }


  @Test
  public void toStringTest() {
    String expectedResult = "\nInstructor: Griffin Newbold; Location: 417 IAB; Time: 11:40-12:55";
    assertEquals(expectedResult, testCourse.toString());
  }

  @Test
  public void testGetInstructorName() {
    String expectedResult = "Griffin Newbold";
    String actualResult = testCourse.getInstructorName();
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetLocation() {
    String expectedResult = "417 IAB";
    String actualResult = testCourse.getCourseLocation();
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testTimeSlot() {
    String expectedResult = "11:40-12:55";
    String actualResult = testCourse.getCourseTimeSlot();
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testReassignInstructor() {
    testCourse.reassignInstructor("John Doe");
    assertEquals("John Doe", testCourse.getInstructorName());
    testCourse.reassignInstructor("Griffin Newbold");
  }

  @Test
  public void testReassignLocation() {
    testCourse.reassignLocation("510 IAB");
    assertEquals("510 IAB", testCourse.getCourseLocation());
    testCourse.reassignLocation("417 IAB");
  }

  @Test
  public void testReassignTimeSlot() {
    testCourse.reassignTime("1:00-2:15");
    assertEquals("1:00-2:15", testCourse.getCourseTimeSlot());
    testCourse.reassignTime("11:40-12:55");
  }

  @Test
  public void testEnrollStudent() {
    testCourse.setEnrolledStudentCount(200);
    // Enroll students and check if the course is full
    assertFalse(testCourse.isCourseFull()); // Should not be full yet
    assertTrue(testCourse.enrollStudent()); // After one student enrolls
  }

  @Test
  public void testDropStudent() {
    testCourse.setEnrolledStudentCount(200);
    // drop students
    assertFalse(testCourse.isCourseFull()); // Should not be full yet
    assertTrue(testCourse.dropStudent()); // After one student drops
  }

  /** The test course instance used for testing. */
  public static Course testCourse;
}

