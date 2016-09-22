package com.cbs.edu.init_order;

/**
 * Created by evgeniy on 22/09/16.
 */
public class B extends A {

    int filedB;

    static {
        System.out.println("Static init block B");
    }

    {
        System.out.println("Non static init block B");
    }

    public B(int filedA, int filedB) {
        super(filedA);
        this.filedB = filedB;
        System.out.println("Constructor B");
    }
}
