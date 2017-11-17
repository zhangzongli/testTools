package main.java;

import java.math.BigDecimal;

/**
 * Created by zhangzl on 2017/9/22.
 */
public class AboutNull {

    public static void main(String[] args) {

        Object object = null;
        Test test = new Test();
        test.setA((BigDecimal) object);

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
}
