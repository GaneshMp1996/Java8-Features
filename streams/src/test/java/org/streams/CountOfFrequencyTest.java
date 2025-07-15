package org.streams;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOfFrequencyTest {
    @Test
    public void testGetFrequencyMap() {
        List<String> fruits = Arrays.asList(
                "Apple", "Banana", "Apple", "Mango", "Orange", "Apple");

        Map<String, Long> expected = new HashMap<>();
        expected.put("Apple", 3L);
        expected.put("Banana", 1L);
        expected.put("Mango", 1L);
        expected.put("Orange", 1L);

        Map<String, Long> actual = CountOfFrequency.getFrequencyMap(fruits);
        assertEquals(expected, actual, "Frequency map should match expected counts");
    }
}

