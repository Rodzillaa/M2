import org.junit.Test;

import edu.gatech.oad.antlab.person.Person4;
import static org.junit.Assert.*;



public class Person4Tester {
    private Person4 p4test;
    private Person4 p4test2 = new Person4("aa");

    @Test
    public void test() {
    	String test1 = "abc123";
        p4test = new Person4(test1);
        assertEquals("abc123bcd234", p4test.toString(test1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() {
    	String newstring = p4test2.toString(null);
    }


}
