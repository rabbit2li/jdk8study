package juc01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 1.线程池：提供了一个线程队列，队列中保存着所有等待状态的线程。避免了创建与销毁额外开销，提高了响应的速度。
 * <p>
 * 2.线程池的体系结构
 * java.util.concurrent.Executor：负责线程的使用与调度的根接口
 * |--ExecutorService 子接口：线程池的主要接口
 * |--ThreadPoolExecutor：实现类
 * |--ScheduledExecutorService 子接口：负责线程的调度
 */
public class TestThreadPool {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);

        List<Future> list = new ArrayList<>();

        for (int j = 0; j < 10; j++) {
            Future<Integer> future = pool.submit(() -> {
                int sum = 0;
                for (int i = 0; i <= 100; i++) {
                    sum += i;
                }
                return sum;
            });

            list.add(future);
        }

        pool.shutdown();

        for (Future future : list) {
            System.out.println(future.get());
        }

        /*ThreadPoolDemo poolDemo = new ThreadPoolDemo();

        //2.为线程池中的线程分配任务
        for (int i = 0; i < 10; i++) {
            pool.submit(poolDemo);
        }

        //3.关闭线程池
        pool.shutdown();*/
    }
//    new Thread(poolDemo).start();
//    new Thread(poolDemo).start();
}

class ThreadPoolDemo implements Runnable {

    private int i = 0;

    @Override
    public void run() {
        while (i <= 100) {
            System.out.println(Thread.currentThread().getName() + " : " + i++);
        }
    }
}
