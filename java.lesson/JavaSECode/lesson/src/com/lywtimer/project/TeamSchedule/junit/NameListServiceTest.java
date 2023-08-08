package com.lywtimer.project.TeamSchedule.junit;

import com.lywtimer.project.TeamSchedule.domain.Employee;
import com.lywtimer.project.TeamSchedule.service.NameListService;
import com.lywtimer.project.TeamSchedule.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListServiceTest
 * Package: com.lywtimer.project.TeamSchedule.junit
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/7 20:42
 */
public class NameListServiceTest {
    @Test
    public void test1(){
        NameListService service = new NameListService();
        final Employee[] allEmployees = service.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
        }

    }
    @Test
    public void testGetEmployee(){
        try {
            NameListService service = new NameListService();
//            final Employee employee = service.getEmployee(-1);
//            final Employee employee = service.getEmployee(2);
            final Employee employee = service.getEmployee(12);
            System.out.println(employee);
        } catch (TeamException e) {
            throw new RuntimeException(e);
        }
    }
}
