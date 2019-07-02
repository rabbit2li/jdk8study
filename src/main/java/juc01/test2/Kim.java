package juc01.test2;

public class Kim extends Person {

    public Kim() {
        System.out.println("子类构造...");
    }

    public Kim(int n) {
//        super(2);
        a = n;
        System.out.println("子类有参构造..." + a);
    }

    static {
        System.out.println("子类静态代码块...");
    }

    {
        System.out.println("子类代码块...");
    }

    public static void main(String[] args) {
        Kim kim = new Kim(3);
    }
}
