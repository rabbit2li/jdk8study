package juc01;

import java.util.Random;
import java.util.concurrent.*;

public class TestScheduledThreadPool {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);

        for (int i = 0; i < 10; i++) {
            ScheduledFuture<Integer> future = pool.schedule(() -> {
                int num = new Random().nextInt(100); //生成随机数
                System.out.println(Thread.currentThread().getName() + " : " + num);
                return num;
            }, 1, TimeUnit.SECONDS);

            System.out.println(future.get());
        }

        pool.shutdown();
    }
}
