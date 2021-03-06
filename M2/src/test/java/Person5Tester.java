/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import static org.junit.Assert.*;

import edu.gatech.oad.antlab.person.Person5;
import org.junit.Test;

public class Person5Tester {
  private Person5 p5one = new Person5("Anish");
  private Person5 p5two = new Person5("Nathaniel");

  @Test
  public void testPerson5() {
    assertEquals("Anishonkeys5m", p5one.toString("5monkeys"));
    assertEquals("Anish", p5one.toString(""));
    assertEquals("Nathanielopspo", p5two.toString("poops"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testToStringNullInput() {
    String output = p5one.toString(null);
  }
}
