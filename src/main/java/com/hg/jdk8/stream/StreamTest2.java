package com.hg.jdk8.stream;

import java.util.stream.IntStream;

public class StreamTest2 {

    public static void main(String[] args) {
        IntStream.of(new int[]{3, 4, 5}).forEach(System.out::print);
        System.out.println();

        IntStream.range(1, 6).forEach(System.out::print);
        System.out.println();
        IntStream.rangeClosed(1, 6).forEach(System.out::print);
    }
}
