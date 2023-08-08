package com.lywtimer.project.TeamSchedule.service;

import com.lywtimer.project.TeamSchedule.domain.Architect;
import com.lywtimer.project.TeamSchedule.domain.Designer;
import com.lywtimer.project.TeamSchedule.domain.Employee;
import com.lywtimer.project.TeamSchedule.domain.Programmer;

/**
 * ClassName: TeamService
 * Package: com.lywtimer.project.TeamSchedule.service
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 19:29
 */
public class TeamService {
    private static int counter = 1;
    private final static int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public TeamService() {
    }

    public Programmer[] getTeam() {
        Programmer[] newTeam = new Programmer[total];
        for (int i = 0; i < total; i++) {
            newTeam[i] = this.team[i];
        }
        return newTeam;
    }

    /**
     * @param e
     * @throws TeamException
     */
    public void addMember(Employee e) throws TeamException {
/* 失败信息包含以下几种：
        成员已满，无法添加
        该成员不是开发人员，无法添加
        该员工已是某团队成员
        该员工正在休假，无法添加
        该员工已在本开发团队中

        */

        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已达上限，无法添加");
        }
        if (!(e instanceof Programmer programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        if (programmer.getStatus() == Status.BUSY) {
            throw new TeamException("该员工已是某团队成员");
        }
        if (programmer.getStatus() == Status.VOCATION) {
            throw new TeamException("该员工正在休假，无法添加");
        }
        boolean isExist = isExist(programmer);
        if (isExist) {
            throw new TeamException("该员工已在本开发团队中");
        }
//        团队中至多只能有一名架构师
//        团队中至多只能有两名设计师
//        团队中至多只能有三名程序员
        int architectCounter = 0;
        int designerCounter = 0;
        int programmerCounter = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                architectCounter++;
            } else if (team[i] instanceof Designer) {
                designerCounter++;
            } else {
                programmerCounter++;
            }
        }
        if (programmer instanceof Architect) {
            if (architectCounter >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (programmer instanceof Designer) {
            if (designerCounter >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else {
            if (programmerCounter >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        //正常添加逻辑
        team[total++] = programmer;
        programmer.setMemberId(counter++);
        programmer.setStatus(Status.BUSY);
    }

    private boolean isExist(Programmer programmer) {
        for (int i = 0; i < total; i++) {
           if (team[i].getId() == programmer.getId()){
               return true;
           }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        boolean isFind = false;
        for (int i = 0; i < total; i++) {
            if (!isFind && (memberId == team[i].getMemberId())) {
                //调整属性
                team[i].setStatus(Status.FREE);
                isFind = true;
            }
            if (isFind) {
                total--;
                if (i == total) {
                    team[total] = null;
                } else {
                    team[i] = team[i+1];
                }
            }
        }
        if (!isFind) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
    }
}
