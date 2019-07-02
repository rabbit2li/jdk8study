package com.hg.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {

    public static void main(String[] args) {
//        TestInterface1 testInterface1 = () -> {};
//        System.out.println(testInterface1.getClass().getInterfaces()[0]);
//
//        TestInterface2 testInterface2 = () -> {};
//        System.out.println(testInterface2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> System.out.println("hello world")).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach(item -> System.out.println(item.toUpperCase()));

        List<String> list2 = new ArrayList<>();
//        list.forEach(item -> list2.add(item.toUpperCase()));
//        list2.forEach(item -> System.out.println(item));

//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));

        Function<String, String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);
    }

}

@FunctionalInterface
interface TestInterface1 {

    void method();
}

@FunctionalInterface
interface TestInterface2 {

    void method2();
}


