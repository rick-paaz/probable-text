package probable;

// Using JUnit 4 to test OurHashMap

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class OurHashMapTest {
  
  @Test
  public void testGenericity() {
    OurMap<String, Integer> one = new OurHashMap<String, Integer>();
    assertEquals(0, one.size());  // size() only works accidentally
    OurMap<Integer, String> another = new OurHashMap<Integer, String>();
    assertEquals(0, another.size());  // size() only works accidentally
  }

  @Test
  public void testFileRead() {
    Scanner inputFile = null;
    try {
       // Because this is a Maven project, the input files are in src/main/resources
       inputFile = new Scanner(new File("./src/main/resources/Alice"));
    } catch (FileNotFoundException e) {
      System.out.println("Alice not found");
    }
    String line = inputFile.nextLine();
    assertTrue(line.length() > 0);
    // Verify the first three lines match the book in the file named "Alice".
    System.out.println(line); 
    System.out.println(inputFile.nextLine()); // 2nd line is blank
    System.out.println(inputFile.nextLine()); 
  }
  


}
