package com.lywtimer.oop.equals;

import java.util.Objects;

/**
 * ClassName: MyCoreDate
 * Package: com.lywtimer.oop.equals
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/5 12:43
 */
public class MyCoreDate {

    private int day;
    private int month;
    private int year;

    public MyCoreDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCoreDate that = (MyCoreDate) o;
        return day == that.day && month == that.month && year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return "年:" + year + "月:" + month + "日:" + day;
    }
}
