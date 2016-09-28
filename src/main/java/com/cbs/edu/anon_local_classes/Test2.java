package com.cbs.edu.anon_local_classes;

/**
 * Created by evgeniy on 27/09/16.
 */
public class Test2 {
    {
        class Local {

        }
    }

    public Test2() {
        class Local {

        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 2);
        cat.move();

        Cat homeCat = new Cat("Nurka", 4){
            public int k = 10;

            @Override
            public void move() {
                System.out.println("Move like a home cat");
            }
        };
        homeCat.move();

        new Cat("Tom", 4){
            @Override
            public void move() {
                System.out.println("Move like a Tom cat");
            }
        }.move();

        new Cat("", 2);

    }


    public void f() {
        class Local extends Test2 implements Cloneable {
            public int k;

            public Local(int k) {
                this.k = k;
            }

            void k() {

            }

            class B {

            }
        }

        Local local1 = new Local(1);
        Local local2 = new Local(1);
    }

    public void h() {
//        Local local = new Local();
    }
}
