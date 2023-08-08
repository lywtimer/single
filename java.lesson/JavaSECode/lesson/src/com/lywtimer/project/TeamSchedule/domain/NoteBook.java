package com.lywtimer.project.TeamSchedule.domain;

/**
 * ClassName: NoteBook
 * Package: com.lywtimer.project.TeamSchedule.domain
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 19:10
 */
public class NoteBook implements Equipment {
    private String model;
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "("+ price +")";
    }
}
