package com.hg.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest operatorTest = new BinaryOperatorTest();
        System.out.println(operatorTest.compute(2, 2, (a, b) -> a + b));
        System.out.println(operatorTest.compute(2, 2, (a, b) -> a - b));
        System.out.println(operatorTest.compute(2, 2, (a, b) -> a * b));
        System.out.println(operatorTest.compute(2, 2, (a, b) -> a / b));

        System.out.println(operatorTest.getShort("adfkssfjl", "fsdfilj", Comparator.comparingInt(String::length)));
        System.out.println(operatorTest.getShort("adfkssfjl", "fsdfilj", Comparator.comparingInt(a -> a.charAt(0))));
    }

    public int compute(int a, int b, BinaryOperator<Integer> operator) {
        return operator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }

}
