package com.hg.jdk8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 18);
        Student student2 = new Student("lisi", 26);
        Student student3 = new Student("wangwu", 23);
        Student student4 = new Student("zhaoliu", 20);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

//        students.sort((param1, param2) -> Student.compareStudentByScore(param1, param2));
//        students.forEach(student -> System.out.println(student.getScore()));
//        System.out.println("---------------");
//
//        students.sort(Student::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));

//        students.sort(Student::compareStudentByName);
//        students.forEach(student -> System.out.println(student.getName()));

//        StudentComparator comparator = new StudentComparator();
//        students.sort((param1, param2) -> comparator.compareStudentByName(param1, param2));
//        students.forEach(student -> System.out.println(student.getName()));

//        students.sort(comparator::compareStudentByName);
//        students.forEach(student -> System.out.println(student.getName()));

//        students.sort(comparator::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));

//        students.sort(Student::compareByScore);
//        students.forEach(student -> System.out.println(student.getScore()));

//        students.sort(Student::compareByName);
//        students.forEach(student -> System.out.println(student.getName()));

        List<String> cities = Arrays.asList("guangzhou", "zhuhai", "shantou", "hangzhou");

//        Collections.sort(cities,(city1,city2)-> city1.compareToIgnoreCase(city2));
//        cities.forEach(System.out::println);

//        Collections.sort(cities, String::compareToIgnoreCase);
//        cities.forEach(System.out::println);

        MethodReferenceTest referenceTest = new MethodReferenceTest();
        System.out.println(referenceTest.getString(String::new));

        System.out.println(referenceTest.getString2("hello", String::new));
    }

}
