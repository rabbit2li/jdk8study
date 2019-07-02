package test;

import juc01.test2.TestMethod;

public class Test {

    public static void main(String[] args) {

        long sum = 0;
        long start = System.currentTimeMillis();
        for (long i = 0; i <= 100000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(sum + " : " + (end - start));
    }
}
