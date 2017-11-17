package main.java;

import java.lang.reflect.Field;

/**
 * Created by zhangzl on 2017/10/20.
 */
public class EntityTest {

    public static void main(String[] args) {
        Test test = new Test();
        Field[] fields = test.getClass().getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        for(int i=0;i<fields.length;i++){
            System.out.println(fields[i].getType());
            fieldNames[i]=fields[i].getName();
        }

    }


    public static class Test {

        //id
        private Long id;

        //ÐÕÃû
        private String name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
