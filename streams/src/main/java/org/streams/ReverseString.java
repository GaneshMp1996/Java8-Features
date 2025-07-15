package org.streams;

public class ReverseString {

    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        String rev = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}

