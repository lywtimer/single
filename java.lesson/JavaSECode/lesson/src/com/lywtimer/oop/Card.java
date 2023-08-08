package com.lywtimer.oop;

/**
 * ClassName: Card
 * Package: com.lywtimer.oop
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 10:20
 */
public class Card extends Base {
    private String number;
    private String[] tags;
    private int expire;

    public Card(String number) {
        this.number = number;
    }

    public Card(String number, String[] tags) {
        this(number);
        this.tags = tags;
    }

    public String getNumber() {
        return number;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void info(){
        System.out.println("编号:" + number + " 标签 [" + "]" + " 过期时间:" + expire);
    }
}
