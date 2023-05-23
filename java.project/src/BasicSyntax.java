public class BasicSyntax {


    public static void main(String[] args) {


        System.out.print("System.out.print 不换行...");
        System.out.println();

        for (int i = 10; i-- > 0;) {
            System.out.println(i);
        }


        byte b1=10;

        byte b2=20;

        byte b3= (byte) (b1+b2);

        System.out.println(b3);
    }
}
