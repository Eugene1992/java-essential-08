package com.cbs.edu.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by evgeniy on 29/09/16.
 */
public class ReturnCatchFinally {
    public static void main(String[] args) {
        k();
    }

    public static int f() {
        try {
            int k = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("catch");
            return 20;
        } finally {
            System.out.println("finally");
            return 30;
        }
    }

    public static void k() {
        OutputStream out = null;
        try {
            out = new FileOutputStream("C:/temp.txt");

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
