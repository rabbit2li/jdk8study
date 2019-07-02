package juc01.hg;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1.用于解决多线程安全问题的方式
 * synchronized：隐式锁
 * (1 同步代码块
 * <p>
 * (2 同步方法
 * <p>
 * jdk1.5以后：
 * (3 同步锁Lock
 * 注意：是一个显示锁，需要通过lock()方法上锁，必须通过unlock()方法进行释放锁
 */
public class TestLock {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket, "1号窗口").start();
        new Thread(ticket, "2号窗口").start();
        new Thread(ticket, "3号窗口").start();
    }
}

class Ticket implements Runnable {

    private int ticket = 100;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //上锁
            lock.lock();
            try {
                if (ticket > 0) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " 完成售票，余票为：" + --ticket);
                }
            } finally {
                //释放锁
                lock.unlock();
            }
        }
    }
//    public void run() {
//        synchronized (this) {
//            while (true) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(200);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + " 完成售票，余票为：" + --ticket);
//                }
//            }
//        }
//    }
}

