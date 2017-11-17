package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzl on 2017/5/23.
 */
public class ListVoid {

    public static void main (String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("String1");
        addStr(list);
        System.out.println(list);
    }

    private static void addStr(List<String> list) {
        list.add("String2");
    }
}
