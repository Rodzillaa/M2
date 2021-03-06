/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import static org.junit.Assert.*;

import edu.gatech.oad.antlab.person.Person1;
import org.junit.Test;

public class Person1Tester {
  private Person1 p1 = new Person1("Dr. Tester");

  @Test
  public void testToStringNormal() {
    String output = p1.toString("anish2");
    assertEquals(output, "Dr. Testerish2an");
    output = p1.toString("an");
    assertEquals(output, "Dr. Testeran");
    output = p1.toString("");
    assertEquals(output, "Dr. Tester");
    output = p1.toString("gtg123b");
    assertEquals(output, "Dr. Testerg123bgt");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testToStringNullInput() {
    p1.toString(null);
  }
}
