package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzl on 2018/3/29.
 */
public class ArrayTest {

    public static void main(String[] args) {
        getValue();

    }

    public static void getValue() {
        List<String> list = new ArrayList<String>() {
            {
                add("1");
                add("2");
            }
        };
        System.out.println(list.toString());
        System.out.println(list.toString().split(","));
//        System.out.println(arr[0]);
    }
}
