package main.java;

/**
 * Created by zhangzl on 2018/6/29.
 */
public class ThreadTest {

    static Object o1 = new Object();
    static Object o2 = new Object();

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread t1 = threadTest.new test1();
        Thread t2 = threadTest.new test2();
        t1.start();
        t2.start();
    }

    public class test1 extends Thread {

        @Override
        public void run() {
            synchronized (o1) {
                System.out.println("t1 o1");
                try{
                    Thread.sleep(1000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println("t1 o2");
                }
            }
        }
    }

    public class test2 extends Thread {

        @Override
        public void run() {
            synchronized (o2) {
                System.out.println("t2 o2");
                try{
                    Thread.sleep(1000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (o1) {
                    System.out.println("t2 o1");
                }
            }
        }
    }

}
