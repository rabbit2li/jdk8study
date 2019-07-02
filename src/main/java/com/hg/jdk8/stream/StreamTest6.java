package com.hg.jdk8.stream;

import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest6 {

    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        stream.findFirst().ifPresent(System.out::println);

//        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
        System.out.println(Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2)
                .map(item -> item * 2).skip(2).limit(2).reduce(0, Integer::sum));
    }

}
