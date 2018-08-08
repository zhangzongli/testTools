package main.java;

/**
 * Created by zhangzl on 2017/9/19.
 */
public class StringSplit {

    public static void main(String[] args) {
//        String a = "jdbc:mysql://www.tsingcon.com:3306/db_0104_bjbysy?useSSL=false";
//        String[] arr = a.split("/|\\?");
//        System.out.println(arr[3]);

        String a = "1;2;";
        String b = a.replace(";", ",");
    }
}
