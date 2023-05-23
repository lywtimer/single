package com.i9youth.basicDate;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime()); //当前时间的毫秒数

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "-" + c.get(Calendar.MONTH)+ "-" + c.get(Calendar.DATE));
        //Date---->String
        //String ------->Date
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        System.out.println(simpleDateFormat.format(c.getTime()));
        c.add(Calendar.DATE, 2);
        System.out.println(simpleDateFormat.format(c.getTime()));
        System.out.println(simpleDateFormat.format(d.getTime()));
        String dateStr = "2022-08-10 23:59:59.000";
        try {
            Date d2 = simpleDateFormat.parse(dateStr);
            System.out.println(d2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        System.out.println("=========BigDecimal=========");
        double d1 = 1.0d;
        double d2 = 0.9d;
        System.out.println(d1 - d2);
        BigDecimal bigDecimal1 = new BigDecimal(d1);
        BigDecimal bigDecimal2 = new BigDecimal(d2);
        System.out.println(bigDecimal1.subtract(bigDecimal2));
        System.out.println(bigDecimal1.subtract(bigDecimal2, new MathContext(2)));

        long l1 = 10000000000000L;
        long l2 = 10000000000000L;
        System.out.println(l1 * l2);
        BigDecimal bigDecimal3 = new BigDecimal("10");
        BigDecimal bigDecimal4 = new BigDecimal("10000000000000");
        System.out.println(bigDecimal3.multiply(bigDecimal4));
        System.out.println(bigDecimal3.divide(new BigDecimal(3), 2, BigDecimal.ROUND_CEILING));

    }
}
