package main.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by zhangzl on 2017/9/15.
 */
public class mapStream {

    public static void main(String[] args) {

        List<Demo> demoList = new ArrayList<Demo>() {
            {
                add(new Demo(1225311222, "test", 324324324));
                add(new Demo(234325435, "test", 2343242));
                add(new Demo(345346546, "test1", 23423423));
                add(new Demo(234234234, "test1", 435345));
                add(new Demo(234234235, "test", 5645645));
                add(new Demo(234234234, "test", 23423));
            }
        };

        Calendar from1 = Calendar.getInstance();
        OptionalDouble result = demoList.stream()
                .filter(d -> d.getValue().equals("test"))
                .mapToDouble(d -> d.getFlag())
                .average();
        BigDecimal a = new BigDecimal(result.getAsDouble());
        Calendar to1 = Calendar.getInstance();
        System.out.print(to1.getTimeInMillis() - from1.getTimeInMillis());


        Calendar from2 = Calendar.getInstance();
        int c = 0;
        int b = 0;
        for (Demo demo : demoList) {
            c += demo.getFlag();
            b += demo.getCode();
        }
        int e = c/4;
        int f = b/4;
        Calendar to2 = Calendar.getInstance();


        System.out.print(to2.getTimeInMillis() - from2.getTimeInMillis());

    }

    public static class Demo {

        public Demo(int flag, String value, int code){
            this.flag = flag;
            this.code = code;
            this.value = value;
        }

        private int flag;

        private String value;

        private int code;

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
