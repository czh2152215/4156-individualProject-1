package dev.coms4156.project.individualproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

/**
 * Department unit tests.
 */
@ContextConfiguration
public class DepartmentUnitTests {

  /** The test department instance used for testing. */
  public static Department testDepartment;

  /** BeforeEach. */
  @BeforeEach
  public void setupDepartmentForTesting() {
    Map<String, Course> courses = new HashMap<>();
    courses.put("101", new Course("Dr. John", "Room 101", "10:00-11:00", 50));
    testDepartment = new Department("CS", courses, "Dr. Smith", 200);
  }

  @Test
  public void toStringTest() {
    String expectedResult =
        "CS 101: \nInstructor: Dr. John; Location: Room 101; Time: 10:00-11:00\n";
    String actualResult = testDepartment.toString();
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetDepartmentChair() {
    String expectedResult = "Dr. Smith";
    String actualResult = testDepartment.getDepartmentChair();
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetNumberOfMajors() {
    int expectedResult = 200;
    int actualResult = testDepartment.getNumberOfMajors();
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetCourseSelection() {
    Map<String, Course> courses = testDepartment.getCourseSelection();
    assertNotNull(courses);
    assertEquals(1, courses.size());
    assertTrue(courses.containsKey("101"));
  }

  @Test
  public void testAddPersonToMajor() {
    int initialMajors = testDepartment.getNumberOfMajors();
    testDepartment.addPersonToMajor();
    assertEquals(initialMajors + 1, testDepartment.getNumberOfMajors());
  }

  @Test
  public void testAddCourse() {
    Course newCourse = new Course("Dr. Alice", "Room 202", "2:00-3:15", 100);
    testDepartment.addCourse("202", newCourse);
    Map<String, Course> courses = testDepartment.getCourseSelection();
    assertEquals(2, courses.size());
    assertTrue(courses.containsKey("202"));
  }
}
