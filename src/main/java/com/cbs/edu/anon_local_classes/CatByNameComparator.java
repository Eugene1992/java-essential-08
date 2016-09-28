package com.cbs.edu.anon_local_classes;

import java.util.Comparator;

public class CatByNameComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}
