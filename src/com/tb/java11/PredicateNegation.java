package com.tb.java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Since Java 11
public class PredicateNegation {
    public static boolean even(Integer i) {
        return i % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> evenNumbers = numbers.stream()
                .filter(PredicateNegation::even).collect(Collectors.toList());
        System.out.println(evenNumbers); // [2, 4]

        List<Integer> nonEvenNumbers = numbers.stream()
                .filter(Predicate.not(PredicateNegation::even)).collect(Collectors.toList());
        System.out.println(nonEvenNumbers); // [1, 3, 5]
    }
}
