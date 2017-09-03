import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;
import edu.gatech.oad.antlab.person.*;

public class Person2Tester {

    private String test1, test2, test3, test4, test5, test6;

    @Test
    public void accountForAllLetters() {
        String test1 = "Testing string 437829";
        String test2 = "abcdefghijklmnopqrstuvwxyz";
        String test3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String test4 = "0123456789";
        String test5 = "abcdefghijklmnopqrstuvwxyz0123456789";
        String test6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        HashMap<String, Integer> test1HashMap = toHashMap(test1);
        Person2 persontest1 = new Person2(test1);
        String persontest1string = persontest1.toString(test1);
        System.out.println(persontest1string);
        assertEquals(test1.length() * 2, persontest1string.length());
        //assertEquals(persontest1string.substring(0, test1.length()), "Testing string 437829");
        String persontest1randomized = persontest1string.substring(test1.length(), persontest1string.length());

        HashMap<String, Integer> test1randomizedHashMap = toHashMap(persontest1randomized);

        for (String key : test1HashMap.keySet()) {
            assertEquals(test1HashMap.get(key), test1randomizedHashMap.get(key));
        }

        HashMap<String, Integer> test2HashMap = toHashMap(test2);
        Person2 persontest2 = new Person2(test2);
        String persontest2string = persontest2.toString(test2);
        assertEquals(test2.length() * 2, persontest2string.length());
        assertEquals(persontest2string.substring(0, test2.length()), "abcdefghijklmnopqrstuvwxyz");
        String persontest2randomized = persontest2string.substring(test2.length(), persontest2string.length());

        HashMap<String, Integer> test2randomizedHashMap = toHashMap(persontest2randomized);

        for (String key : test2HashMap.keySet()) {
            assertEquals(test2HashMap.get(key), test2randomizedHashMap.get(key));
        }


        HashMap<String, Integer> test3HashMap = toHashMap(test3);
        Person2 persontest3 = new Person2(test3);
        String persontest3string = persontest3.toString(test3);
        assertEquals(test3.length() * 2, persontest3string.length());
        assertEquals(persontest3string.substring(0, test3.length()), "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String persontest3randomized = persontest3string.substring(test3.length(), persontest3string.length());

        HashMap<String, Integer> test3randomizedHashMap = toHashMap(persontest3randomized);

        for (String key : test3HashMap.keySet()) {
            assertEquals(test3HashMap.get(key), test3randomizedHashMap.get(key));
        }

        HashMap<String, Integer> test4HashMap = toHashMap(test4);
        Person2 persontest4 = new Person2(test4);
        String persontest4string = persontest4.toString(test4);
        assertEquals(test4.length() * 2, persontest4string.length());
        assertEquals(persontest4string.substring(0, test4.length()), "0123456789");
        String persontest4randomized = persontest4string.substring(test4.length(), persontest4string.length());

        HashMap<String, Integer> test4randomizedHashMap = toHashMap(persontest4randomized);

        for (String key : test4HashMap.keySet()) {
            assertEquals(test4HashMap.get(key), test4randomizedHashMap.get(key));
        }

        HashMap<String, Integer> test5HashMap = toHashMap(test5);
        Person2 persontest5 = new Person2(test5);
        String persontest5string = persontest5.toString(test5);
        assertEquals(test5.length() * 2, persontest5string.length());
        assertEquals(persontest5string.substring(0, test5.length()), "abcdefghijklmnopqrstuvwxyz0123456789");
        String persontest5randomized = persontest5string.substring(test5.length(), persontest5string.length());

        HashMap<String, Integer> test5randomizedHashMap = toHashMap(persontest5randomized);

        for (String key : test5HashMap.keySet()) {
            assertEquals(test5HashMap.get(key), test5randomizedHashMap.get(key));
        }

        HashMap<String, Integer> test6HashMap = toHashMap(test6);
        Person2 persontest6 = new Person2(test6);
        String persontest6string = persontest6.toString(test6);
        assertEquals(test6.length() * 2, persontest6string.length());
        assertEquals(persontest6string.substring(0, test6.length()), "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String persontest6randomized = persontest6string.substring(test6.length(), persontest6string.length());

        HashMap<String, Integer> test6randomizedHashMap = toHashMap(persontest6randomized);

        for (String key : test6HashMap.keySet()) {
            assertEquals(test6HashMap.get(key), test6randomizedHashMap.get(key));
        }
    }

    private HashMap<String, Integer> toHashMap(String input) {
        String[] letterArray = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            letterArray[i] = Character.toString(input.charAt(i));
        }
        HashMap<String, Integer> hashed = new HashMap<String, Integer>();
        for (String letter : letterArray) {
            if (hashed.containsKey(letter)) {
                hashed.put(letter, hashed.get(letter) + 1);
            } else {
                hashed.put(letter, 1);
            }
        }
        return hashed;
    }


}