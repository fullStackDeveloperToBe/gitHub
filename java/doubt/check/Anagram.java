package com.java.doubt.check;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    static boolean isAnagram(String s1, String s2) {
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        if(c1.length != c2.length) {
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1+ "-"+c2);
        return true;
    }
    public static void main(String[] args) {
        String a="Hello", b="hello";
        boolean ans = isAnagram(a, b) ? true : false;
        System.out.println(ans);

    }
}
