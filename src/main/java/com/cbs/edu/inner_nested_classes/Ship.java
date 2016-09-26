package com.cbs.edu.inner_nested_classes;

/**
 *     внутренние inner  non-static
 *     вложенные  nested static
 */
public class Ship extends SuperShip {
    private int pf;
    public int npf;
    private static int sf;

    public class Engine extends SuperEngine {

        public void engineMethod() {
            System.out.println(superShipField);
            System.out.println(superEngineField);
            superShipMethod();
            superEngineMethod();

            System.out.println(pf);
            System.out.println(npf);
            System.out.println(sf);
        }

        public class InnerEngine {

        }

        public int getPrivateField() {
            return pf;
        }
    }

    static class StaticNested {
        public void f(Ship ship) {
            System.out.println(sf);
            System.out.println(ship.pf);
        }
    }

    public void shipMethod() {
        System.out.println(new Engine().superEngineField);
        new Engine().engineMethod();
    }
}
