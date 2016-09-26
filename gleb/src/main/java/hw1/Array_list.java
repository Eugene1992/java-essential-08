package hw1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Gleb on 25.09.2016.
 */
public class Array_list {
    public static void main(String[] arg) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add("Hello world!");
            linkedList.add("Hello world!");
        }
        long startGetAl = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++){
            arrayList.get(500);
        }
        long endGetAL = System.currentTimeMillis();
        System.out.println("ArrayList .get() - " + (endGetAL - startGetAl));

        long startGetAlL = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++){
            linkedList.get(500);
        }
        long endGetALL = System.currentTimeMillis();
        System.out.println("ArrayList .get() - " + (endGetALL - startGetAlL));

        long startSetAl = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++){
            arrayList.set(500, "Hello");
        }
        long endSetAL = System.currentTimeMillis();
        System.out.println("ArrayList .set() - " + (endSetAL - startSetAl));

        long startSetAlL = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++){
            linkedList.set(500, "Hello");
        }
        long endSetALL = System.currentTimeMillis();
        System.out.println("ArrayList .set() - " + (endSetALL - startSetAlL));

        long startRemoveAl = System.currentTimeMillis();
            arrayList.remove(400);
        long endRemoveAL = System.currentTimeMillis();
        System.out.println("ArrayList .rem() - " + (endRemoveAL - startRemoveAl));

        long startRemoveAlL = System.currentTimeMillis();
            linkedList.remove(400);
        long endRemoveALL = System.currentTimeMillis();
        System.out.println("ArrayList .rem() - " + (endRemoveALL - startRemoveAlL));
    }
}