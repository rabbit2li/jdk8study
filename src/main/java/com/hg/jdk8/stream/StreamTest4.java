package com.hg.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java", "js", "py");
//        String[] stringArray = stream.toArray(length -> new String[length]);
//        String[] stringArray1 = stream.toArray(String[]::new);

//        Arrays.asList(stringArray).forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toList());

//        List<String> list = stream.collect(() -> new ArrayList(), (theList, item) -> theList.add(item),
//                (theList1, theList2) -> theList1.addAll(theList2));
//        List<String> list = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

//        list.forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
//        list.forEach(System.out::println);

//        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set.getClass());
//        set.forEach(System.out::println);

        String str = stream.collect(Collectors.joining());
        System.out.println(str);
    }
}
