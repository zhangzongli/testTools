package main.java;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by zhangzl on 2017/3/16.
 */
public class StringNull {


    public static void main(String[] args) {

//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
        stringBufferClear();
    }

    public static void stringBufferClear() {

        StringBuffer aaa = new StringBuffer("aaaa");
        System.out.println(aaa.toString());
        aaa.setLength(0);
        System.out.println(aaa.toString());
    }
}
