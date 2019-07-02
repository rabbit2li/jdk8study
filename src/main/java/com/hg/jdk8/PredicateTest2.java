package com.hg.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest2 test2 = new PredicateTest2();

//        test2.conditionFilter(list, item -> item % 2 == 0);
//        test2.conditionFilter(list, item -> item % 2 == 1);
//        test2.conditionFilter(list, item -> item > 4);
//        test2.conditionFilter(list, item -> true);

        test2.conditionFilter2(list, item -> item > 5, item -> item % 2 == 0);

        System.out.println(test2.isEqual("test").test("test"));

    }

    public void conditionFilter(List<Integer> numList, Predicate<Integer> predicate) {
        for (Integer nums : numList) {
            if (predicate.test(nums)) {
                System.out.print(nums + " ");
            }
        }
        System.out.println();
    }

    public void conditionFilter2(List<Integer> numList, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer nums : numList) {
            if (predicate.and(predicate2).test(nums)) {
                System.out.print(nums + " ");
            }
        }
        System.out.println();
    }

    public Predicate<String> isEqual(Object object){
        return Predicate.isEqual(object);
    }
}
