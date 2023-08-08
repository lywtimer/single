package com.lywtimer.project.TeamSchedule.domain;

/**
 * ClassName: Designer
 * Package: com.lywtimer.project.TeamSchedule.domain
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 19:26
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public Designer() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return toStringTpl("设计师", getBonus());
    }

    @Override
    public String getDetailsForTeam() {
        return super.getDetailsForTeam("设计师", getBonus());
    }
}
