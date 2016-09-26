package com.cbs.edu.lists;

import java.util.ArrayList;

/**
 * Created by evgeniy on 23/09/16.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);

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
