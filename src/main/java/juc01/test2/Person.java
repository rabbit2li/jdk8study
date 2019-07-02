package juc01.test2;

public class Person {

    /*private static Person person = new Person();
    private static int a = 0;
    public static int b;

    public static Person getPerson() {
        return person;
    }

    public Person() {
        a += 1;
        b += 1;
        System.out.println(a + "---" + b);
    }

    public static void main(String[] args) {
        Person person = Person.person;
        System.out.println(Person.a + "---" + Person.b);
    }*/

    public  static int a = 1;

    public Person() {
        System.out.println("父类构造...");
    }

    public Person(int i) {
        a = i;
        System.out.println("父类有参构造...");
    }

    static {
        System.out.println("父类静态代码块...");
    }

    {
        System.out.println("父类代码块...");
    }

}


