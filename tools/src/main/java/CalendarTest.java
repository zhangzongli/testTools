package main.java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangzl on 2017/9/29.
 */
public class CalendarTest {

    public static void main(String[] args) {
        nullTest();
    }

    public static void nullTest() {
        try {
            Date date = Calendar.getInstance().getTime();
            Calendar from = Calendar.getInstance();
            from.setTime(date);
            Calendar fromNull = null;
//            fromNull.setTime(date);��ָ��
            fromNull = from;
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("");
        }


    }

    public void test1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1998);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }

}
