package com.lywtimer.oop.abstractor;

/**
 * ClassName: GeometricObj
 * Package: com.lywtimer.oop.abstractor
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/6 11:37
 */
public abstract class GeometricObj {
    protected String color;
    protected double weight;

    public GeometricObj(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double findArea();
}
