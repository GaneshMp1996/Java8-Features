package org.streams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ThirdHighestNumberTest {

    @Test
    public void testThirdHigest() {
        // Input list
        List<Integer> numbers = Arrays.asList(10, 45, 32, 67, 89, 21, 90, 56);

        // Expected output
        List<Integer> expected = Arrays.asList(67);
        Optional<Integer> findThird=numbers.
                stream()
                .distinct()
                .sorted(Comparator.reverseOrder()).
                skip(2).findFirst();


        System.out.println("Top 3 highest numbers: " + findThird);
        assertEquals(findThird,expected ,"Expected Matched");








    }
}
