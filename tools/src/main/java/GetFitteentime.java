package main.java;

import java.util.Calendar;

/**
 * Created by zhangzl on 2017/4/10.
 */
public class GetFitteentime {

    public static Calendar toFifteenMinutes(Calendar calendar) {

        Calendar time = (Calendar) calendar.clone();

        int fifteen = 15;
        int minutes = time.get(Calendar.MINUTE);
        int remainder = minutes%fifteen;

        time.set(Calendar.MINUTE, (remainder + 1)*fifteen);
        time.set(Calendar.SECOND, 0);
        time.set(Calendar.MILLISECOND, 0);

        return time;
    }

    public static void main(String[] args) {
        System.out.println(toFifteenMinutes(Calendar.getInstance()).getTime());
    }
}
