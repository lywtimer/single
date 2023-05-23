package com.i9youth.basicCollection;


public class Point <T>{
    private T x;
    private T y;

    public static <M> void checkValue(M v) {
        if (v instanceof Integer) {
            System.out.println(v + "开始累加");
        }

    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

