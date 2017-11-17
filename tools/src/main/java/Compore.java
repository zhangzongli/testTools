package main.java;

import java.util.Calendar;
import java.util.stream.StreamSupport;

/**
 * Created by zhangzl on 2017/9/19.
 */
public class Compore {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        Long from1 = System.nanoTime();
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("max=" + max);
        Long to1 = System.nanoTime();
        System.out.println(to1 - from1);

        Long from2 = System.nanoTime();
        int max2 = 0;
        if (a > b) {
            max2 = a;
        }else {
            max2 = b;
        }

        if (max2 < c) {
            max2 = c;
        }
        System.out.println("max2=" + max2);
        Long to2 = System.nanoTime();
        System.out.println(to2 - from2);

    }
}
