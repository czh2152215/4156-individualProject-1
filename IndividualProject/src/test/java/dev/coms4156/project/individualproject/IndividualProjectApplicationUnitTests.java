package dev.coms4156.project.individualproject;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

/** Unit tests for IndividualProjectApplicatio.java .*/
@SpringBootTest
public class IndividualProjectApplicationUnitTests {

  private IndividualProjectApplication application;
  private MyFileDatabase mockDatabase;

  /** Before Each Unit Test. */
  @BeforeEach
  public void setUp() {
    application = new IndividualProjectApplication();
    mockDatabase = Mockito.mock(MyFileDatabase.class);
    IndividualProjectApplication.overrideDatabase(mockDatabase);
  }

  @Test
  public void testRunWithSetupArgument() {
    // Given
    String[] args = {"setup"};

    // When
    application.run(args);

    // Then
    assertNotNull(IndividualProjectApplication.myFileDatabase);
    verify(mockDatabase, never()).saveContentsToFile();
    System.out.println("testRunWithSetupArgument passed");
  }

  @Test
  public void testRunWithoutSetupArgument() {
    // Given
    String[] args = {};

    // When
    application.run(args);

    // Then
    assertNotNull(IndividualProjectApplication.myFileDatabase);
    verify(mockDatabase, never()).saveContentsToFile();
    System.out.println("testRunWithoutSetupArgument passed");
  }

  @Test
  public void testResetDataFile() {
    // Given
    doNothing().when(mockDatabase).setMapping(any());

    // When
    application.resetDataFile();

    // Then
    verify(mockDatabase, times(1)).setMapping(any());
    System.out.println("testResetDataFile passed");
  }
}
