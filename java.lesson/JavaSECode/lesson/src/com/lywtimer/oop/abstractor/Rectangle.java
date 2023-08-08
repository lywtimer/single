package com.lywtimer.oop.abstractor;

/**
 * ClassName: Rectangle
 * Package: com.lywtimer.oop.abstractor
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 11:39
 */
public class Rectangle extends GeometricObj{
    private double width;
    private double height;

    public Rectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return this.height * this.width;
    }
}
