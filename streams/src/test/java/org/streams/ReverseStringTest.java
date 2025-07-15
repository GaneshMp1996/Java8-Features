package org.streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    @Test
    public void reverseStringWithNormalString() {
        String input = "HelloWorld";
        String expected = "dlroWolleH";
        assertEquals(expected, ReverseString.reverseString(input));
    }

    @Test
    public void reverseStringWithEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, ReverseString.reverseString(input));
    }

    @Test
    public void reverseStringWithSingleCharacter() {
        String input = "A";
        String expected = "A";
        assertEquals(expected, ReverseString.reverseString(input));
    }

    @Test
    public void reverseStringWithPalindrome() {
        String input = "madam";
        String expected = "madam";
        assertEquals(expected, ReverseString.reverseString(input));
    }

    @Test
    public void reverseStringWithSpaces() {
        String input = "Hello World";
        String expected = "dlroW olleH";
        assertEquals(expected, ReverseString.reverseString(input));
    }

    @Test
    public void reverseStringWithSpecialCharacters() {
        String input = "123@abc!";
        String expected = "!cba@321";
        assertEquals(expected, ReverseString.reverseString(input));
    }
}
