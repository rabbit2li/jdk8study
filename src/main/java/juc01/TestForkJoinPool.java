package juc01;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class TestForkJoinPool {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        long start = System.currentTimeMillis();
        ForkJoinTask<Long> task = new ForkJoinSumCaculate(0L, 100000000L);
        Long sum = task.invoke();
        long end = System.currentTimeMillis();
        System.out.println(sum + " : " + (end - start));
    }
}

class ForkJoinSumCaculate extends RecursiveTask<Long> {

    private long start;
    private long end;

    private static final long THURSHOLD = 10000L; //临界值

    public ForkJoinSumCaculate(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;
        if (length <= THURSHOLD) {
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            long middle = (start + end) / 2;

            ForkJoinSumCaculate left = new ForkJoinSumCaculate(start, middle);
            left.fork(); //进行拆分，同时压入线程队列

            ForkJoinSumCaculate right = new ForkJoinSumCaculate(middle + 1, end);
            right.fork(); //进行拆分，同时压入线程队列

            return left.join() + right.join();
        }
    }

}
