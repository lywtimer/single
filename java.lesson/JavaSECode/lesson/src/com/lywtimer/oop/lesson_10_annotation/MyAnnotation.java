package com.lywtimer.oop.lesson_10_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: MyAnnotation
 * Package: com.lywtimer.oop.lesson_10_annotation
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 6:56
 */
@Target({TYPE, FIELD, METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String value() default "type desc";
}
