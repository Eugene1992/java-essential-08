package com.cbs.edu.generics.cov_inv;

import com.cbs.edu.generics.*;

import java.util.Collections;

/**
 * Created by evgeniy on 30/09/16.
 */
public class Test {
    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 11;
        Employee employee = new Employee("Ivan");

        A a = new A();
        B b = new B();
        C c = new C();

        printNtimesCov(3, b);
        printNtimesCovInt(3, c);
    }

    static <E> void printNtimes(int n, E e) { // invariance
        for (int i = 0; i < n; i++) {
            System.out.println(e);
        }
    }

    static <E extends B> void printNtimesCov(int n, E e) { // covariance
        for (int i = 0; i < n; i++) {
            System.out.println(e);
        }
    }

    static <E extends I> void printNtimesCovInt(int n, E e) { // covariance
        for (int i = 0; i < n; i++) {
            System.out.println(e);
        }
    }

    /*static <E> void printNtimesContr(int n, E<? super B> e) { // contravariance
        for (int i = 0; i < n; i++) {
            System.out.println(e);
        }
    }*/
}
