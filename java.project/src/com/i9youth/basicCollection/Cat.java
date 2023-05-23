package com.i9youth.basicCollection;

public class Cat implements Comparable<Cat>{
    private Integer age;
    private String name;

    public Cat(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Cat o) {
        System.out.println(this.name + ":" + o.getName());
        if (this.getAge() > o.getAge()) {
            return -1;
        } else if (this.getAge() < o.getAge()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
