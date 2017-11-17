package main.java;

/**
 * Created by zhangzl on 2017/3/3.
 */
public class GetStringLength {

    public static void main(String[] args) {
        String a = "00000000000000000000001000000000000000010000000001100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011000000000000";
//        String a = "0";
        System.out.println(a.length());
    }

    public static Long getLong(Object obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof Long) {
            return (Long) obj;
        } else {
            if (obj.toString().equals("")) {
                return null;
            }
            return new Long(obj.toString().trim());
        }
    }
}
