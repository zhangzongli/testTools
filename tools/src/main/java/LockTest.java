package main.java;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Bucket bucket = new Bucket(); // 构造篮子
        new Thread(new Producer(bucket),"Producer线程").start();
        new Thread(new Consumer(bucket),"Consumer线程").start();
    }
}

final class Consumer implements Runnable {
    private Bucket bucket;

    public Consumer(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bucket.get();
        }
    }

}

final class Producer implements Runnable {
    private Bucket bucket;

    public Producer(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // 来回十次交易
            bucket.put((int) (Math.random() * 1000));
        }
    }
}

class Bucket {
    private int packOdBalls;
    private boolean available = false;
    private final ReentrantLock lock = new ReentrantLock();
    private Condition noBull = lock.newCondition();
    private Condition fullBull = lock.newCondition();
    private static boolean flag1 = true;
    private static boolean flag2 = true;

    public int get() { // 消费者从篮子里面取出球
        lock.lock();
        System.out.println("消费者获取了锁哈哈哈哈哈哈哈哈");
        try {
            while (flag1) { // 如果没有就等着,但是为什么不是if呢？后面会做解析
                System.out.println("消费者：暂时没有球可以消费我就等着...");
                noBull.await(); // wait();
            }
            flag2 = false;
            System.out.println("消费者获得了" + packOdBalls + "个球");
            available = false;
            System.out.println("持有消费线程数： "+lock.getHoldCount());
            fullBull.signal(); // notify();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            flag2 = true;
            lock.unlock();
        }
        // 有的话就取出来
        return packOdBalls;
    }

    public synchronized void put(int packOdBalls) { // 生产者将生产球并放入到篮子里面
        lock.lock();
        System.out.println("生产者获取了锁哈哈哈哈哈哈哈哈");
        try {
            while (!flag2) {
                System.out.println("生产者：既然篮子里面已经有球了我就消费完了再生产吧！");
                fullBull.await(); // wait();
            }
            flag1 = false;
            this.packOdBalls = packOdBalls;
            available = true;
            System.out.println("生产者放进去了" + packOdBalls + "个球");
            noBull.signal(); // notify();
//            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            flag1 = true;
            lock.unlock();
        }

    }

}