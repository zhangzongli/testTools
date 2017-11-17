package main.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.OptionalDouble;

/**
 * Created by zhangzl on 2017/10/18.
 */
public class BigdicmalTest {

    public static void main(String[] args) {
        nullTest();
    }

    public static void zero() {

        BigDecimal one = new BigDecimal(0.000);
        BigDecimal two = new BigDecimal(0.600);
        BigDecimal three = null;
        if (null != one && null != two && two.compareTo(BigDecimal.ZERO) != 0) {
            three = one.divide(two, 2, RoundingMode.HALF_UP);
        }

        System.out.println(three);

    }

    public static void nullTest() {
//        int a = null;
    }
}
