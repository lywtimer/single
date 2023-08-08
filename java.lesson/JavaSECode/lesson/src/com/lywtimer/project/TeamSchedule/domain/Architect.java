package com.lywtimer.project.TeamSchedule.domain;

/**
 * ClassName: Architect
 * Package: com.lywtimer.project.TeamSchedule.domain
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 19:26
 */
public class Architect extends Designer{
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public Architect() {
    }

    @Override
    public String toString() {
        return toStringTpl("架构师", getBonus(), getStock());
    }

    @Override
    public String getDetailsForTeam() {
        return super.getDetailsForTeam("架构师", getBonus(), getStock());
    }
}
