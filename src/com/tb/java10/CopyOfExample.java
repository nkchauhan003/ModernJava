package com.tb.java10;

import java.util.*;

// Since Java 10
public class CopyOfExample {

    public static void main(String[] args) {

        /* -----List----- */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //unmodifiable
        List<Integer> listCopy = List.copyOf(list);
        //listCopy.add(4); -- UnsupportedOperationException

        list.add(4);
        list.add(5);

        System.out.println(list); // [1, 2, 3, 4, 5]
        System.out.println(listCopy); // [1, 2, 3]

        /* -----Set----- */
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        //unmodifiable
        Set<Integer> setCopy = Set.copyOf(set);
        //setCopy.add(4); -- UnsupportedOperationException

        set.add(4);
        set.add(5);

        System.out.println(set); // [1, 2, 3, 4, 5]
        System.out.println(setCopy); // [1, 2, 3]

        /* -----Map----- */
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        //unmodifiable
        Map<Integer,Integer> mapCopy = Map.copyOf(map);
        //mapCopy.add(4,4); -- UnsupportedOperationException

        map.put(4,4);
        map.put(5,5);

        System.out.println(map); // {1=1, 2=2, 3=3, 4=4, 5=5}
        System.out.println(mapCopy); // [1, 2, 3]
    }
}
