package juc01.hg;

/**
 * 1.volatile关键字：当多个线程操作共享数据时，可保证内存中的数据是可见的
 * 相较于synchronized是一种较为轻量级的策略
 * 注意：
 * 1.volatile不具备”互斥性“
 * 2.volatile不能保证变量的”原子性“
 */
public class TestVolatile {

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        new Thread(threadTest).start();
        while (true) {
            if (threadTest.isFlag()) {
                System.out.println("-------------");
                break;
            }
        }
    }
}

class ThreadTest implements Runnable {

    private volatile boolean flag = false; //加入volatile关键字

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag = " + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
