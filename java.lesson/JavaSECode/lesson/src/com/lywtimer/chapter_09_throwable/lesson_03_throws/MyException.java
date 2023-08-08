package com.lywtimer.chapter_09_throwable.lesson_03_throws;

/**
 * ClassName: MyException
 * Package: com.lywtimer.chapter_09_throwable.lesson_03_throws
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 14:13
 */
public class MyException extends Exception{
    @java.io.Serial
    static final long serialVersionUID = -3387516993124229949L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
