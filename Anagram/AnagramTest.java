package Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnagramTest {
    Anagram anagram;

    @BeforeEach
    public void setup(){
        anagram = new Anagram();
    }

    @Test
    public void stringsAreAnagrams(){
        assertEquals(true, anagram.anagrams("Gyomorrontás", "toronymorgás"));
    }

    @Test
    public void stringsAreNotAnagrams(){
        assertEquals(false, anagram.anagrams("gyomor", "nyomor"));
    }
}