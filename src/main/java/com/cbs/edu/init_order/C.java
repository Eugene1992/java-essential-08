package com.cbs.edu.init_order;

/**
 * Created by evgeniy on 22/09/16.
 */
public class C extends B {

    int filedC;

    static {
        System.out.println("Static init block C");
    }

    {
        System.out.println("Non static init block C");
    }

    public C(int filedA, int filedB, int filedC) {
        super(filedA, filedB);
        this.filedC = filedC;
        System.out.println("Constructor C");
    }

    public static void main(String[] args) {
        C c = new C(1, 2, 3);
    }
}
