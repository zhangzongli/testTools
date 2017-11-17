package main.java;

/**
 * Created by zhangzl on 2017/9/12.
 */
public class yearList {

    public static void main(String[] args) {
        Integer from = 2017;
        Integer to = 2018;
        Integer[] arr = new Integer[to - from + 1];
        for (int i = 0; i <= to - from + 1; i++) {
            arr[i] = from;
            from += 1;
        }

        System.out.print(arr.toString());
    }
}
