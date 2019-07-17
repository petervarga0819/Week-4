package Sum;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class SumTest {

    Sum sum;

    @BeforeEach
    public void setup(){
        sum = new Sum();
    }

    @Test
    public void sumAddListElementsTogether(){
        List<Integer> listOfIntegers = new ArrayList();
        listOfIntegers.add(2);
        listOfIntegers.add(6);
        listOfIntegers.add(18);
        assertEquals(26, sum.sum (listOfIntegers));
    }

    @Test
    public void sumEmptyList(){
        List<Integer> listOfIntegers2 = new ArrayList<>();
        assertEquals(0, sum.sum(listOfIntegers2));
    }

    @Test
    public void sumOneElement(){
        List<Integer> listOfIntegers3 = new ArrayList<>();
        listOfIntegers3.add(4);
        assertEquals(4, sum.sum(listOfIntegers3));

    }

    @Test
    public void sumMultipleElements(){
        List<Integer> listOfIntegers4 = new ArrayList<>();
        listOfIntegers4.add(9);
        listOfIntegers4.add(10);
        listOfIntegers4.add(11);
        listOfIntegers4.add(76);
        assertEquals(106, sum.sum(listOfIntegers4));
    }

    @Test
    public void sumNull(){
        List<Integer> listOfIntegers5 = null;
        assertEquals(null, listOfIntegers5);
    }
}