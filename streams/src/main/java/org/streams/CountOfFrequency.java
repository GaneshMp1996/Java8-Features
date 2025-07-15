package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfFrequency {
    public static void main(String[] args) {
            List<String> fruits = Arrays.asList(
                    "Apple", "Banana", "Apple", "Mango", "Orange", "Apple");

            Map<String, Long> countOfFrequency = getFrequencyMap(fruits);

            countOfFrequency.forEach((fruit, count) ->
                    System.out.println(fruit + ": " + count));
        }

        public static Map<String, Long> getFrequencyMap(List<String> items) {
            return items.stream()
                    .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        }
    }

