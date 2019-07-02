package com.hg.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {
        Stream stream = Stream.of("java", "js", "py");

        String[] arr = new String[]{"java", "js", "py"};
        Stream stream2 = Stream.of(arr);

        List<String> list = Arrays.asList("java", "js", "py");
        Stream stream3 = list.stream();
    }

}
