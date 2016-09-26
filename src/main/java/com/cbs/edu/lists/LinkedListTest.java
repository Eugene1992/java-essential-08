package com.cbs.edu.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by evgeniy on 23/09/16.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(0, 30);

        System.out.println(list);

        System.out.println(list.get(1));

        list.set(0, 7);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);

        System.out.println(list.size());
    }
}
