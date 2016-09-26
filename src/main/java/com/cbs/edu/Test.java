package com.cbs.edu;

import java.util.ArrayList;

/**
 * Created by evgeniy on 26/09/16.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

//        delete from 4 to 7
        System.out.println(numbers);

        for (int i = 6; i >= 3; i--) {
            numbers.remove(i);
        }

        System.out.println(numbers);
    }
}
