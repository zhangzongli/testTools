package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangzl on 2017/9/13.
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, Map<String, Long>> resultMap = new HashMap<String, Map<String, Long>>();

//        Map<String, Long> one = new HashMap<String, Long>(){
//            {
//                put("1", 1L);
//            }
//        };
//
//        Map<String, Long> two = new HashMap<String, Long>(){
//            {
//                put("2", 2L);
//            }
//        };
//
//        resultMap.put("test", one);
//        resultMap.put("test", two);
        Map<String, Long> three = resultMap.get("test");
        System.out.print(resultMap.toString());

    }
}
