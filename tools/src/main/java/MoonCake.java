package main.java;

/**
 * Created by zhangzl on 2017/9/21.
 */
public class MoonCake {
    public static void main (String[] args) {
        Double num = 12d;
        Double total = 175d;
        System.out.println("总共需要"+Math.rint(total/num)+"箱");
        System.out.println("不满的一箱里面有"+ total%num +"盒");
    }
}
