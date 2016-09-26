package com.cbs.edu.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by evgeniy on 26/09/16.
 */
public class ListsTest {
    public static void main(String[] args) {
//        add    | start | middle | end
//        get    | start | middle | end
//        set    | start | middle | end
//        remove | start | middle | end
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add("Hello world!");
            linkedList.add("Hello world!");
        }

        long startAddAL = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            arrayList.add(500, "Hello world!");
        }
        long endAddAL = System.currentTimeMillis();
        System.out.println("ArrayList .add() - " + (endAddAL - startAddAL));

        long startAddLL = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            linkedList.add(500, "Hello world!");
        }
        long endAddLL = System.currentTimeMillis();
        System.out.println("LinkedList .add() - " + (endAddLL - startAddLL));
     }
}
