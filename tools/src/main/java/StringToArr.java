package main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by zhangzl on 2017/6/7.
 */
public class StringToArr {

    public static void main (String[] args) {
        test2();
    }


    public static void test2() {
        String a = "1,2,3,4";
        String[] arr = a.split(",");
    }




    public void test1(){
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = stdin.readLine();
            String[] strArr = str.split(" ");
            System.out.println(strArr.length);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
