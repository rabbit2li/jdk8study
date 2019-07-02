package juc01.hg;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 1.创建线程的方式三：实现Callable接口。方法可以有返回值，并且可以抛出异常.
 * 2.执行Callable方式，需要FutureTask实现类的支持,用于接收运算结果。FutureTask是Future接口的实现类
 */
public class TestCallable {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();

        //执行Callable方式，需要FutureTask实现类的支持,用于接收运算结果。
        FutureTask<Integer> result = new FutureTask<>(threadDemo);
        new Thread(result).start();

        //接收线程运算后的结果
        try {
            Integer sum = result.get();
            System.out.println("总和：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}
