package com.tb.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Since Java 9
public class CollectionOf {
    public static void main(String[] args) {
        //Immutable
        List list = List.of(1, 2, 3, 4);
        System.out.println(list); // [1, 2, 3, 4]

        //Immutable
        Set set = Set.of(1, 2, 3, 4, 5); // [1, 2, 3, 4, 5]
        System.out.println(set);

        //Immutable
        Map map = Map.of(1, "Sunday", 2, "Monday", 3, "Tuesday");
        System.out.println(map); // {1=Sunday, 2=Monday, 3=Tuesday}
    }
}
