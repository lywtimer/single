package com.lywtimer.project.TeamSchedule.domain;

import com.lywtimer.project.TeamSchedule.service.Status;

/**
 * ClassName: Programmer
 * Package: com.lywtimer.project.TeamSchedule.domain
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 19:22
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer() {
    }


    public String toString() {
        return toStringTpl("程序员");
    }

    protected String toStringTpl(String role) {
        return super.toStringTpl() +
                "\t" + role +
                "\t" + status + "\t\t\t\t" +
                "\t" + equipment.getDescription();
    }

    protected String toStringTpl(String role, double bonus) {
        return super.toStringTpl() +
                "\t" + role +
                "\t" + status +
                "\t" + bonus +
                "\t\t" +
                "\t" + equipment.getDescription();
    }

    protected String toStringTpl(String role, double bonus, int stock) {
        return super.toStringTpl() +
                "\t" + role +
                "\t" + status +
                "\t" + bonus +
                "\t" + stock +
                "\t" + equipment.getDescription();
    }

    public String getDetailsForTeam() {
        return memberId +"/" + getId() + "\t" +
                getName() + "\t" +
                getAge() + "\t" +
                getSalary() + "\t" +
                "程序员";
    }

    public String getDetailsForTeam(String role, double bonus) {
        return memberId +"/" + getId() + "\t" +
                getName() + "\t" +
                getAge() + "\t" +
                getSalary() + "\t" +
                role + "\t" +
                bonus;
    }

    public String getDetailsForTeam(String role, double bonus, int stock) {
        return memberId +"/" + getId() + "\t" +
                getName() + "\t" +
                getAge() + "\t" +
                getSalary() + "\t" +
                role + "\t" +
                bonus + "\t" +
                stock;
    }


}
