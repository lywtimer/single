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
        long res;
        res = x + y * a / x + b / y + c;
        System.out.println(res);
    }
}
