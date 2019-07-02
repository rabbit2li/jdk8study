package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void create(int age, String name, PersonCallBack callBack) {
        Person person = new Person(age, name);
        callBack.callback(person);
    }

    public static Object test(int i, IntFunction intFunction) {
        return intFunction.apply(i);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3,4);
        integers.forEach(System.out::println);



//        Person.create(18, "kim", new PersonCallBack() {
//            @Override
//            public void callback(Person person) {
//                System.out.println("你住的...");
//            }
//        });
//
//        Person.test(1, (i) -> {
//            return 1;
//        });
//
//        Person.create(20, "ruby", person -> System.out.println("巷子里..."));
//
//        Person.create(23, "hg", person -> System.out.println("我租了一间公寓..."));

    }

}
