package com.hg.jdk8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("jue", "mar", "lim", "dark");
        list.forEach(System.out::println);
    }
}
