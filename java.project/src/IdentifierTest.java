public class IdentifierTest {
    public static void main(String[] args) {
        //定义圆周率
        double pi = 3.14;
        double r1 = 1.2;
        double r2 = 2.5;
        int r3 = 6;
        double s1 = r1 * r1 * pi;
        System.out.println("r1的面积 = " + s1);
        System.out.println("r2的面积 = " + r2 * r2 * pi);
        System.out.println("r3的面积 = " + r3 * r3 * pi);

        //字符类型 char(2 byte)
        char c1 = '中';
        System.out.println(c1);
        char c2 = '\u000f';
        System.out.println(c2);
        char c3 = 1999;
        System.out.println(c3);

        float x = 0.12f;
        double y = 0.5;
        int a = 24;
        long b = 10L;
        char c = 10;
        double res;
        res = x + y * a / x + b / y + c;
        System.out.println(res);

        String str1 = "119";
        System.out.println(Integer.parseInt(str1));

        /*
         * **案例：公安局身份登记**
         * 要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等。
         * */
        String name = "lywtimer";
        int age = 37;
        char gender = '男';
        double weight = 120.5;
        boolean isMarried = true;
        String phone = "16619891743";
        System.out.println("name = " + name + " age = " + age +" gender = " + gender +" weight = " + weight +" isMarried = " + isMarried +" phone = " + phone);

        System.out.println('*' + '\t' + "*");

        byte b1 = 125;
        b1 += 5;
        System.out.println(b1);
        int n = 10;
        n += (n++) + (++n);
        System.out.println(n);
        //逻辑运算符 & && | || ! ^

        //位运算符
        System.out.println("1 & 2 = " + (1 & 2));
        System.out.println("1 & 3 = " + (1 & 3));
        System.out.println("1 | 2 = " + (1 | 2));
        System.out.println("1 ^ 2 = " + (1 ^ 2));
        System.out.println("7 ^ 2 = " + (7 ^ 2));
        System.out.println("3<<4 = " + (3<<4));
        System.out.println("-3<<4 = " + (-3<<4));

//        **案例3：**今天是周2，10天以后是周几？
//        要求：控制台输出"今天是周2，10天以后是周x"。
        int today = 1;
        int days = 13;
        int day = (today + days) % 7;
        System.out.println("今天是周" + today + "，" + days + "天以后是周" + (day > 0 ? day : "日"));

    }
}
