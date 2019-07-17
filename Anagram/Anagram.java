package Anagram;

import java.util.Arrays;

public class Anagram {
    public boolean anagrams(String string1, String string2){
        if (string1.length() != string2.length()){
            return false;
        }
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String stringChar1 = new String(char1);
        String stringChar2 = new String(char2);
        return stringChar1.equals(stringChar2);
    }
}