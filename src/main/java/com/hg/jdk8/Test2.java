package com.hg.jdk8;

@FunctionalInterface
interface MyInterface {

    void test();

    String toString();

}

public class Test2 {

    public void myTest(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.myTest(() -> System.out.println("12"));

        System.out.println("----------------");

        MyInterface myInterface = () -> {
            System.out.println("123456");
        };

        System.out.println(myInterface.getClass());

        System.out.println(myInterface.getClass().getSuperclass());
    }
}


