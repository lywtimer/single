package com.lywtimer.oop.lesson_09_enum;

/**
 * ClassName: Season2
 * Package: com.lywtimer.oop.lesson_09_enum
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 16:36
 */
public enum Season2 implements Info{
    SPRING("spring", "春风扬起你我的离别"){
        @Override
        public void show() {
            System.out.println("春暖花开");
        }
    },
    SUMMER("summer", "夏雨打湿孤单的屋檐"){
        @Override
        public void show() {
            System.out.println("夏日炎炎");
        }
    },
    AUTUMN("autumn", "秋叶飘落思念的红叶"){
        @Override
        public void show() {
            System.out.println("秋高气爽");
        }
    },
    WINTER("winter", "冬雪转眼又是一年"){
        @Override
        public void show() {
            System.out.println("白雪皑皑");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public String toString() {
//        return "Season2{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}

interface Info{
    void show();
}

