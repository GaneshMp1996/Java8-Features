package org.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ThirdHighestNumber {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 45, 32, 67, 89, 21, 90, 56);

            // Find the 3 highest numbers using streams
            List<Integer> topThree = numbers.stream()
                    .sorted((a, b) -> b - a) // Sort in descending order
                    .limit(3)               // Take the first 3 elements
                    .collect(Collectors.toList());

            System.out.println("Top 3 highest numbers: " + topThree);
        }
    }

