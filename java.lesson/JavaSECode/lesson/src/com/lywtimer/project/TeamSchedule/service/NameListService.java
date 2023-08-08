package com.lywtimer.project.TeamSchedule.service;

import com.lywtimer.project.TeamSchedule.domain.*;

/**
 * ClassName: NameListService
 * Package: com.lywtimer.project.TeamSchedule.service
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 19:28
 */
public class NameListService {
    private Employee[] employees;

    /**
     * Description:

     * */
    public NameListService() {

        //根据项目提供的Data类构建相应大小的employees数组
        employees = new Employee[Data.EMPLOYEES.length];
        //再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
        //{"13", "2", "马化腾", "32", "18000", "15000", "2000"},

        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            //获取通用属性
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type) {
                case Data.EMPLOYEE -> {
                    employees[i] = new Employee(id, name, age, salary);
                }
                case Data.PROGRAMMER -> {
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                }
                case Data.DESIGNER -> {
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                }
                case Data.ARCHITECT -> {
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                }
            }
        }
//将对象存于数组中
//Data类位于com.atguigu.team.service包中

    }

    private Equipment createEquipment(int index) {
        String[] equipmentData = Data.EQUIPMENTS[index];
        int equipmentType = Integer.parseInt(equipmentData[0]);
        Equipment equipment = null;
        String model = equipmentData[1];
        String priceOrDisplayOrType = equipmentData[2];
        switch (equipmentType) {
            case Data.NOTEBOOK -> {
                double price = Double.parseDouble(priceOrDisplayOrType);
                equipment = new NoteBook(model, price);
            }
            case Data.PC -> equipment = new PC(model, priceOrDisplayOrType);
            case Data.PRINTER -> equipment = new Printer(model, priceOrDisplayOrType);
        }
        return equipment;
    }

    public Employee[] getAllEmployees(){
        return employees;
    }
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()) {
                return employees[i];
            }
        }
        throw new TeamException("未找到指定员工");
    }
    public static void main(String[] args) {

    }
}
