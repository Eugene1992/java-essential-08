package com.cbs.edu.init_order;

/**
 * Created by evgeniy on 22/09/16.
 */
public class StaticVarInit {

    static {
        k = 10;
        // g = 10;
    }

    {
        k = 10;
        g = 10;
    }

    static int k;
    int g;

    public StaticVarInit() {
        k = 10;
        g = 10;
    }

    static void s(StaticVarInit svr1) {
        k = 10;
        svr1.g = 10;
    }

    void ns() {
        k = 10;
        g = 10;
    }

    public static void main(String[] args) {
        StaticVarInit svr1 = new StaticVarInit();
        StaticVarInit svr2 = new StaticVarInit();
        svr1.ns();
        StaticVarInit.s(svr1);
    }
}
