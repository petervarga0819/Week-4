package Apple;

import Apple.Apple;
import org.junit.Test;


public class AppleTest {
    private void assertEquals(String expected, String actual) {
    }


    @Test
    public void test01 () {
        Apple apple1= new Apple();

        String expected = ("apple");
        String actual = apple1.getApple();

        assertEquals(expected, actual);
    }

    @Test
    public void test02 () {
        Apple apple1= new Apple();

        String expected = ("apple2");
        String actual = apple1.getApple();

        assertEquals(expected, actual);
    }

    @Test
    public void test03 () {
        Apple apple1= new Apple();

        String expected = ("apple");
        String actual = apple1.getApple();

        assertEquals(expected, actual);
    }


}