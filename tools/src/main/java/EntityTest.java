package main.java;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzl on 2017/10/20.
 */
public class EntityTest {

    public static void main(String[] args) {

//        Test test = new Test();
//        Field[] fields = test.getClass().getDeclaredFields();
//        String[] fieldNames=new String[fields.length];
//        for(int i=0;i<fields.length;i++){
//            System.out.println(fields[i].getType());
//            fieldNames[i]=fields[i].getName();
//        }
        EntityTest entityTest = new EntityTest();
        entityTest.lambdaTest();

    }


    public void lambdaTest() {
        List<Test> tests = new ArrayList<Test>() {
            {
                add(new Test(null));
                add(new Test(null));
                add(new Test(null));
            }
        };
        Long a = tests.stream().filter(t -> t.getId() != null).mapToLong(t -> t.getId()).sum();
        System.out.println(a);
    }

    public static class Test {

        Test(Long id) {
            this.id = id;
        }

        //id
        private Long id;

        //????
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
