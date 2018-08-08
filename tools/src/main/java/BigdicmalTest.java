package main.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 * Created by zhangzl on 2017/10/18.
 */
public class BigdicmalTest {

    public static void main(String[] args) {
//        nullTest();
//        getMaxByStream();
//        zeroCompare();
        Object a = null;
        String b = a.toString();
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

    public static void getMaxByStream() {
        List<BigDecimal> test = new ArrayList<BigDecimal>();
//        test.add(new BigDecimal(1));
//        test.add(new BigDecimal(2));
//        test.add(new BigDecimal(3));
//        test.add(new BigDecimal(4));
//        test.add(new BigDecimal(5));
//        test.add(new BigDecimal(6));
//        test.add(new BigDecimal(7));
//        test.add(new BigDecimal(8));
//        test.add(new BigDecimal(9));
        test.add(null);
        Optional<BigDecimal> max = test.stream().filter(t -> t != null).max((x,y) -> x.compareTo(y));
        if (max.equals(Optional.empty())) {
            System.out.println("���ֵ�ǿյ�");
            return;
        }else {
            float a = max.get().floatValue();
            System.out.println(a);
        }

    }

    private static void zeroCompare() {
        BigDecimal a = new BigDecimal(0);
        BigDecimal b = BigDecimal.ZERO;
        a.compareTo(b);
    }
}
