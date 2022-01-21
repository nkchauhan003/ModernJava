package com.tb.java11;

import java.util.List;
import java.util.stream.Collectors;

// Since Java 11
public class StringUtility {
    public static void main(String[] args) {
        /* isBlank*/
        String str = "";
        System.out.println(str.isBlank()); // true

        String str1 = "  ";
        System.out.println(str1.isBlank()); // true

        String str2 = "abc";
        System.out.println(str2.isBlank()); // false

        /* strip*/
        String str3 = " abc ";
        System.out.println(str3.strip()); // "abc"

        String str4 = " abc ";
        System.out.println(str4.stripLeading()); // " abc"

        String str5 = " abc ";
        System.out.println(str5.stripTrailing()); // "abc "

        /* lines()*/
        String str6 = """
                Line 1
                Line 2
                Line 3
                """;
        List<String> lines=str6.lines().collect(Collectors.toList());
        System.out.println(lines);
    }
}
