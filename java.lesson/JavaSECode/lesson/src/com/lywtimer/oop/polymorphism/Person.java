package com.lywtimer.oop.polymorphism;

import java.util.Objects;

/**
 * ClassName: Person
 * Package: com.lywtimer.oop.polymorphism
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/5 9:29
 */
public class Person {
    private String name;
    private int age;

    public void hobby(){
        System.out.println("人应该有兴趣爱好");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
