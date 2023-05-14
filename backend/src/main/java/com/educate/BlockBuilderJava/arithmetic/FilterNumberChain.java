package com.educate.BlockBuilderJava.arithmetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterNumberChain {
    public static List<Integer> getOneHundredNumbers() {
        return IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Integer> removeDuplicateNumbers(List<Integer> inputNumbers, Set<Integer> duplicateNumbers) {
        return inputNumbers.stream()
                .filter(element -> !duplicateNumbers.contains(element))
                .toList();
    }

    public static List<Integer> getBackNumbers(List<Integer> inputNumbers) {
        return IntStream.range(0, 100)
                .filter(element -> !inputNumbers.contains(element))
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Integer> getRandomNumbers(List<Integer> inputNumbers, int count) {
        Collections.shuffle(inputNumbers);
        return inputNumbers.stream()
                .distinct()
                .limit(count)
                .collect(Collectors.toList());
    }
}
