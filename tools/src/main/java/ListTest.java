package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zhangzl on 2017/9/22.
 */
public class ListTest {

    public static void main(String[] args) {

//        test1();
        sunListTest();

    }


    public static void sunListTest() {
        List<String> oneList = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>(){
            {
                add("1");
                add("2");
                add("3");
            }
        };
        oneList = list1.subList(1, 2);
        oneList.clear();
        System.out.println(list1.toString());

    }



    public static void test1() {
        List<Project> projects = new ArrayList<>();

        int ids = projects.stream().mapToInt(p -> p.getId()).sum();
        List<Integer> idList = projects.stream().map(p -> p.getId()).collect(Collectors.toList());
    }
    class Project {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void test() {
        List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>() {
            {
                add(new HashMap<String, Object>() {
                    {
                        put("k","1");
                        put("v", "11");
                    }
                });
                add(new HashMap<String, Object>() {
                    {
                        put("k","2");
                        put("v", "22");
                    }
                });
                add(new HashMap<String, Object>() {
                    {
                        put("k","3");
                        put("v", "33");
                    }
                });
            }
        };

        boolean h = list1.get(0).containsKey("1");

        Map<String, Object> map = list1.stream().filter(l -> "4".equals(l.get("k"))).findFirst().get();
    }
}
