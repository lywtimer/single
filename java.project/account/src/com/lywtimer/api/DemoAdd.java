package com.lywtimer.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: Demo
 * Package: com.lywtimer.api
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/18 7:22
 */
public class DemoAdd extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Map<String, String[]> parameterMap = req.getParameterMap();
        final Set<Map.Entry<String, String[]>> entrySet = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entrySet) {
            System.out.println(entry.getKey() + "=" + Arrays.toString(entry.getValue()));
        }
    }
}
