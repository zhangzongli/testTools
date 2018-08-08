package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangzl on 2017/9/13.
 */
public class MapTest {

    public static void main(String[] args) {
//        Map<String, Map<String, Long>> resultMap = new HashMap<String, Map<String, Long>>();

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
//        Map<String, Long> three = resultMap.get("test");
//        System.out.print(resultMap.toString());

//        listMap();

        Map<String, List<String>> resultMap = new HashMap<String, List<String>>();
        resultMap.put("111", new ArrayList<String>() {
            {
                add("1111");
            }
        });
        resultMap.put("222", new ArrayList<String>() {
            {
                add("2222");
            }
        });


    }

    public static void listMap() {
        List<Map<String, String>> listMap = new ArrayList<Map<String, String>>(){
            {
                add(new HashMap<String, String>() {
                    {
                        put("1", "11");
                    }
                });
                add(new HashMap<String, String>() {
                    {
                        put("2", "22");
                    }
                });
                add(new HashMap<String, String>() {
                    {
                        put("3", "33");
                    }
                });
            }
        };

        Map<String, String> map = new HashMap<String, String>() {
            {
                put("aaa", "aaa");
                put("bbb", "bbb");
            }
        };

    }
}
