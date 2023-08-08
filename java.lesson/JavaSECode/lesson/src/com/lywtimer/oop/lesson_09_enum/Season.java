package com.lywtimer.oop.lesson_09_enum;

/**
 * ClassName: Season
 * Package: com.lywtimer.oop.lesson_09_enum
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 16:27
 */
//jdk5.0之前的枚举类
public class Season {
    private final String seasonName;
    private final String seasonDesc;

    public Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4.创建当前类的实例
    public static final Season spring = new Season("spring", "春风扬起你我的离别");
    public static final Season summer = new Season("summer", "夏雨打湿孤单的屋檐");
    public static final Season autumn = new Season("autumn", "秋叶飘落思念的红叶");
    public static final Season winter = new Season("winter", "冬雪转眼又是一年");
}
