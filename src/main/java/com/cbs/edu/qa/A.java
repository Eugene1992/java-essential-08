package com.cbs.edu.qa;

/**
 * Created by evgeniy on 28/09/16.
 */
public class A {
    public int a;
    private int b;
    private static int c;
    int d;

    void nonStaticMethod() {
        A.IC ic = new A().new IC(){
//            public int a = 10;

            void d() {
                System.out.println(a);
                System.out.println(b);
            }

            /*static*/ void f() {
                d();
            }
        };

        ic.f();
    }


//    inner
    class IC {
        void f() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
//    nested
    static class NC {
        void f() {
//            System.out.println(a);
//            System.out.println(b);
            System.out.println(c);
//            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        final int k = 10; // final
        int f = 10;       // effectively final
//        f = 12;


        A.IC ic = new A().new IC(){
            void d() {
                System.out.println(k);
                System.out.println(f);
            }
        };
    }



    static void testMethod(final int arg) {
//        arg = 10;
        System.out.println(arg);
    }
}
