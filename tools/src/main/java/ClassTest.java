package main.java;

/**
 * Created by zhangzl on 2017/9/27.
 */
public class ClassTest {

    public static void main (String[] args) {
        print(ClassTest.class);
    }

    public static void print(Class<?> clsss) {
        System.out.println(clsss.getName());
    }
}
