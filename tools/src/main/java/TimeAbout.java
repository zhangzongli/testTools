package main.java;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhangzl on 2017/9/22.
 */
public class TimeAbout {

    public static void main(String[] args) {

        Long a = 1492493787L;
        Long b = a * 1000L;
//        Date date = new Date();
//        date.setTime(b);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(b);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);//24Сʱ��
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year + "��" + (month + 1) + "��" + day + "��"
                + hour + "ʱ" + minute + "��" + second + "��");
    }
}
