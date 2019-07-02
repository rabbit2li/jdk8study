package com.hg.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> list = Arrays.asList(person1, person2, person3);

        PersonTest personTest = new PersonTest();

//        List<Person> personList = personTest.getPersonsByUsername("zhangsan", list);
//        personList.forEach(person -> System.out.println(person.getUsername() + " " + person.getAge()));

//        List<Person> personList = personTest.getPersonsByAge(20, list);
//        personList.forEach(person -> System.out.println(person.getUsername() + " " + person.getAge()));

        List<Person> personList = personTest.getPersonByAge2(20, list, (age, persons) -> {
            return persons.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        });
        personList.forEach(person -> System.out.println(person.getUsername() + " " + person.getAge()));

    }

    public List<Person> getPersonsByUsername(String username, List<Person> people) {
        return people.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonsByAge(Integer age, List<Person> people) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (PersonAge, personList) -> {
            return personList.stream().filter(person -> person.getAge() > PersonAge).collect(Collectors.toList());
        };
        return biFunction.apply(age, people);
    }

    public List<Person> getPersonByAge2(int age, List<Person> people, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, people);
    }
}
