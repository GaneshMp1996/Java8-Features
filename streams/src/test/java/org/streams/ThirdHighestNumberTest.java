package org.streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdHighestNumberTest {

    @Test
    public void testTopThreeNumbers() {
        // Input list
        List<Integer> numbers = Arrays.asList(10, 45, 32, 67, 89, 21, 90, 56);

        // Expected output
        List<Integer> expectedTopThree = Arrays.asList(90, 89, 67);

        // Actual output using Java 8 features
        List<Integer> actualTopThree = numbers.stream()
                .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
                .limit(3)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Expected: " + expectedTopThree);
        System.out.println("************************");
        System.out.println("Actual: " + actualTopThree);
        // Assert the result
        assertEquals(expectedTopThree, actualTopThree, "The top three numbers should match the expected result.");
    }
}
