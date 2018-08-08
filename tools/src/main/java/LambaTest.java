package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzl on 2018/5/24.
 */
public class LambaTest {

    public static void main(String[] args) {
        List<Test> tests = new ArrayList<Test>();
        for (int i= 0 ; i< 3 ; i++) {
            Test test = new Test();
            test.setValue(null);
            tests.add(test);
        }
        int sum = tests.stream().filter(t -> null != t.getValue()).mapToInt(t -> t.getValue()).sum();
        System.out.println(sum);
    }

    static class Test {
        private Integer value;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }
}
