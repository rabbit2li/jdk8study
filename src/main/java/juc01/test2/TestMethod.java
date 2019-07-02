package juc01.test2;

public class TestMethod {

    protected void proMethod(){
        System.out.println("this is protected method");
    }

    private void priMethod(){
        test();
        System.out.println("this is private method");
    }

    private static void test(){
        System.out.println("this is test method");
    }
}
