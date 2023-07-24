import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AccountDemoTest {
    public static void main(String[] args) {
        boolean flag = true;
        int balance = 10000;
        String info = "";
        while (flag) {
            System.out.print("-----------------谷粒记账软件-----------------\n" +
                    "1 收支明细\n" +
                    "2 登记收入\n" +
                    "3 登记支出\n" +
                    "4 退    出\n" +
                    "请选择(1-4)");
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println("收支\t账户金额\t收支金额\t说 明");
                    System.out.print(info);
                    System.out.println("-----------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int add = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String memo = Utility.readString();
                    balance += add;
                    info += "收入\t" + balance + "\t" + add + "\t" + memo + "\n";
                    System.out.println("-----------------登记完成-----------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int pay = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String payMemo = Utility.readString();
                    balance -= pay;
                    info += "支出\t" + balance + "\t" + pay + "\t" + payMemo + "\n";
                    System.out.println("-----------------登记完成-----------------");
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N):");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        flag = false;
                    }
                    break;
            }
            if (!flag) break;
        }
    }

}
