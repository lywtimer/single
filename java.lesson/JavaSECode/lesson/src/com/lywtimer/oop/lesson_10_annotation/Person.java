package com.lywtimer.oop.lesson_10_annotation;

/**
 * ClassName: Person
 * Package: com.lywtimer.oop.lesson_10_annotation
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 6:57
 */


@MyAnnotation(value = "class")
@SuppressWarnings("unchecked")
public class Person {
    @Deprecated
    private String name;
}
