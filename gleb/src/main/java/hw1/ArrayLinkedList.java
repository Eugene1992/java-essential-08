package hw1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Gleb on 25.09.2016.
 */
public class ArrayLinkedList {
    public static void main(String[] arg) {
        int a = 10, b = 10, c = 300;
        arrayLinkedList(a, b, c);
    }

    static void arrayLinkedList(int a, int b, int c){
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add("Hello world!");
            linkedList.add("Hello world!");
        }
        long startGetAl = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++){
            arrayList.get(a);
        }
        long endGetAL = System.currentTimeMillis();
        System.out.println("ArrayList .get() - " + (endGetAL - startGetAl));

        long startGetAlL = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++){
            linkedList.get(b);
        }
        long endGetALL = System.currentTimeMillis();
        System.out.println("LinkedList .get() - " + (endGetALL - startGetAlL));

        long startSetAl = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++){
            arrayList.set(a, "Hello");
        }
        long endSetAL = System.currentTimeMillis();
        System.out.println("ArrayList .set() - " + (endSetAL - startSetAl));

        long startSetAlL = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++){
            linkedList.set(b, "Hello");
        }
        long endSetALL = System.currentTimeMillis();
        System.out.println("LinkedList .set() - " + (endSetALL - startSetAlL));

        long startRemoveAl = System.currentTimeMillis();
            for (int i = c; i > a; i--) {
                arrayList.remove(a);
            }
        long endRemoveAL = System.currentTimeMillis();
        System.out.println("ArrayList .rem() - " + (endRemoveAL - startRemoveAl));

        long startRemoveAlL = System.currentTimeMillis();
            for (int i = c; i > b; i--) {
                linkedList.remove(b);
            }
        long endRemoveALL = System.currentTimeMillis();
        System.out.println("LinkedList .rem() - " + (endRemoveALL - startRemoveAlL));
    }
}