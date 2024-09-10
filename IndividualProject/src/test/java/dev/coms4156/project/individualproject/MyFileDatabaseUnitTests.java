package dev.coms4156.project.individualproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




/**
 * Tests for the MyFileDatabase class.
 */
public class MyFileDatabaseUnitTests {

  private MyFileDatabase myFileDatabase;
  private String filePath = "./data.txt";  // Test file for database

  /** Before Each Unit Test. */
  @BeforeEach
  public void setup() {
    // Initialize with empty department mapping and save to file
    Map<String, Department> initialMapping = new HashMap<>();
    initialMapping.put("CS", new Department("CS", new HashMap<>(), "Dr. Smith", 100));
    initialMapping.put("Math", new Department("Math", new HashMap<>(), "Dr. Johnson", 80));

    // Create a new database instance and set the initial mapping
    myFileDatabase = new MyFileDatabase(1, filePath);
    myFileDatabase.setMapping(initialMapping);
    myFileDatabase.saveContentsToFile();
  }

  /** After Each Test. */
  @AfterEach
  public void cleanup() {
    // Clean up the test file after running the tests
    File file = new File(filePath);
    if (file.exists()) {
      file.delete();
    }
  }

  @Test
  public void testSerializationAndDeserialization() {
    // Test deserialization
    MyFileDatabase deserializedDb = new MyFileDatabase(0, filePath);
    Map<String, Department> mapping = deserializedDb.getDepartmentMapping();
    assertNotNull(mapping);
    assertEquals(2, mapping.size());
    assertEquals("Dr. Smith", mapping.get("CS").getDepartmentChair());
    assertEquals("Dr. Johnson", mapping.get("Math").getDepartmentChair());
  }

  @Test
  public void testSetMappingAndGetMapping() {
    // Test set and get methods
    Map<String, Department> newMapping = new HashMap<>();
    newMapping.put("Physics", new Department("Physics", new HashMap<>(), "Dr. Brown", 60));

    myFileDatabase.setMapping(newMapping);
    Map<String, Department> retrievedMapping = myFileDatabase.getDepartmentMapping();
    assertEquals(1, retrievedMapping.size());
    assertEquals("Dr. Brown", retrievedMapping.get("Physics").getDepartmentChair());
  }

  @Test
  public void testToString() {
    // Test toString method
    String expectedOutput = "For the CS department: \n"
        + "For the Math department: \n";

    assertEquals(expectedOutput, myFileDatabase.toString());
  }
}
