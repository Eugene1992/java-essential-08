package com.cbs.edu.anon_local_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Barsik", 3);
        Cat cat2 = new Cat("Tom", 4);
        Cat cat4 = new Cat("Murka", 10);
        Cat cat3 = new Cat("Murka", 2);

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat4);
        cats.add(cat3);


//        cat1.compareTo(cat2);
//        cat1 < cat2 -
//        cat1 > cat2 +
//        cat1 = cat2 0

        System.out.println(cats);

        CatByNameComparator comparator = new CatByNameComparator();

        Comparator<Cat> byNameComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat cat1, Cat cat2) {
                String catOneName = cat1.getName();
                String catTwoName = cat2.getName();
                return catTwoName.length() - catOneName.length();
            }
        };

        Collections.sort(cats, byNameComparator);

        System.out.println(cats);
    }
}
