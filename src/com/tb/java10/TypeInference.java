package com.tb.java10;

import java.util.List;

public class TypeInference {
    public static void main(String[] args) {
        var a = 10 + 12;
        System.out.println(a);

        var b = 10 + "Apples";
        System.out.println(b);

        var c = 10 + 12.33;
        System.out.println(c);

        /*...*/

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> otherNumbers = List.of(10, 20, 30, 40, 50);

        //List<List<Integer>> bothNumbers = List.of(numbers, otherNumbers);

        var bothNumbers = List.of(numbers, otherNumbers);
        bothNumbers.stream().findFirst(); // even all methods are available

        /*...*/

        for(var i=0;i<10;i++)
            System.out.print(i); // 0123456789
    }


}
