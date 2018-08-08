package main.java;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Optional;

/**
 * Created by zhangzl on 2017/9/22.
 */
public class AboutNull {

    public static void main(String[] args) {

        StringToInt();

    }


    public static class Test {
        private BigDecimal a;

        public BigDecimal getA() {
            return a;
        }

        public void setA(BigDecimal a) {
            this.a = a;
        }
    }


    public static void OptionalTest() {
        BigDecimal bigDecimal = (BigDecimal) null;
        Calendar calendar = (Calendar) null;
        String string = (String) null;
        System.out.println(bigDecimal.toString());
    }


    public static void StringToInt() {
        String a = null;
        Integer b = Integer.valueOf(a.replace(".000000", ""));
        System.out.println(b);
    }
}
