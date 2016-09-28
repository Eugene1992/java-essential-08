package com.cbs.edu.exceptions;

import java.util.ArrayList;
import java.util.List;

public class UncheckedTest {
    public static void main(String[] args) {
        int a = 10;
        /*int[] arr = new int[1];
        System.out.println(arr[2]);*/

        try {
            int[] arr = new int[1];
//            System.exit(0);
            System.out.println(arr[2]);
            int b = a / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException here!");
        } catch (Exception e) {
            System.err.println("ArithmeticException here!");
        } finally {
            System.out.println("End");
        }
    }
}
