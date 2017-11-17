package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzl on 2017/9/22.
 */
public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){
            {
                add("1111");
                add("2222");
                add("3333");
                add("4444");
            }
        };

        String result = list.get(list.size() - 1);

        System.out.println(result);

    }
}
