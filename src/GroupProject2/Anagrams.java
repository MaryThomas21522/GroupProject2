package GroupProject2;

import java.util.Arrays;

public class Anagrams {

    //is it an anagram?
    boolean sortanagram(String a, String b){
        if(a.length() != b.length()) {
            return false;
        }

        char [] a1= a.toCharArray();
        char [] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
    }

    public static void main(String[] args) {
        Anagrams anagrams=new Anagrams();
            String a="listen";
            String b="silent";
        System.out.println(anagrams.sortanagram(a,b));
    }

}

/*
    Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain
    the same characters in a different order. For example, "listen" and "silent" are anagrams.
 */
