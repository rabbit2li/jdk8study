package com.hg.jdk8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello world");
//        Optional<String> optional = Optional.empty();

        optional.ifPresent(System.out::println);
        System.out.println("---------");

        System.out.println(optional.orElse("change"));
        System.out.println("---------");
        System.out.println(optional.orElseGet(() -> "once"));
    }
}
