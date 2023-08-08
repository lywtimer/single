package com.lywtimer.chapter_09_throwable.lesson_03_throws;

import org.junit.Test;

/**
 * ClassName: ThrowsTest
 * Package: com.lywtimer.chapter_09_throwable.lesson_03_throws
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 13:55
 */
public class ThrowsTest {
    @Test
    public void test1(){
        final Student s1 = new Student();
        s1.register(20);
        s1.register(-20);
        System.out.println("======== run end ========");
    }
}

class Student{
    int id;
    public void register(int id){
        if (id > 0) {
            this.id = id;
        }else {
            //不满足条件手动抛出异常
            throw new RuntimeException("输入的id非法");
        }
    }

    public void register(int id, String pwd) throws Exception {
        if (id > 0) {
            this.id = id;
        }else {
            //不满足条件手动抛出异常
            throw new Exception("输入的id非法");
        }
    }
}
