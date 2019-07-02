package juc01;

public class TestThread8Monitor {

    public static void main(String[] args) {
        Number number = new Number();

        new Thread(Number::getOne).start();
        new Thread(Number::getTwo).start();
    }
}

class Number {

    public static synchronized void getOne() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("one");
    }

    public static synchronized void getTwo() {
        System.out.println("two");
    }
}


