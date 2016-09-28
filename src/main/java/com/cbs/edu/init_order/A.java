package com.cbs.edu.init_order;

/**
 * Created by evgeniy on 22/09/16.
 */
public class A {

    int filedA;

    static {
        System.out.println("Static init block I");
//        System.out.println(k);
    }

    {
        System.out.println("Non static init block I");
        System.out.println(k);
    }

    public static int k = 10;

    public A(int filedA) {
        this.filedA = filedA;
        System.out.println("Constructor I");
    }

}
