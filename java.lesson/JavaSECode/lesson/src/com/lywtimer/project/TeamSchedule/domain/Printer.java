package com.lywtimer.project.TeamSchedule.domain;

/**
 * ClassName: Printer
 * Package: com.lywtimer.project.TeamSchedule.domain
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 19:11
 */
public class Printer implements Equipment {
    private String name;
    private String type;

    @Override
    public String getDescription() {
        return name + "("+ type +")";
    }

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
