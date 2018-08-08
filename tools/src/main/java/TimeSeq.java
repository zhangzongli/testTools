package main.java;

import java.text.*;
import java.util.Calendar;
import java.util.logging.Logger;

/**
 * Created by zhangzl on 2018/3/5.
 */
public class TimeSeq {


    /** The FieldPosition. */
    private static final FieldPosition HELPER_POSITION = new FieldPosition(0);

    /** This Format for format the data to special format. */
    private final static Format dateFormat = new SimpleDateFormat("MMddHHmmssS");

    /** This Format for format the number to special format. */
    private final static NumberFormat numberFormat = new DecimalFormat("0000");

    /** This int is the sequence number ,the default value is 0. */
    private static int seq = 0;

    private static final int MAX = 9999;

    /**
     * ʱ���ʽ��������
     * @return String
     */
    public static synchronized void main(String[] args) {

        Calendar rightNow = Calendar.getInstance();

        StringBuffer sb = new StringBuffer();

        dateFormat.format(rightNow.getTime(), sb, HELPER_POSITION);

        numberFormat.format(seq, sb, HELPER_POSITION);

        if (seq == MAX) {
            seq = 0;
        } else {
            seq++;
        }

        System.out.println(seq);
    }
}
