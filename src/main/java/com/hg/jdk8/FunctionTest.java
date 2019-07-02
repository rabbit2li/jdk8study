package com.hg.jdk8;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(1, value -> {
            return value * 2;
        }));

        System.out.println(functionTest.compute(1, value -> value * 2));

        System.out.println(functionTest.convert(3, v -> v + "hello"));

    }

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }

}
