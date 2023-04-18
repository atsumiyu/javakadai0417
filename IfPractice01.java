package kadai0417;

import java.util.Scanner;
public class IfPractice01 {
    public static void main(String[] args) {
        System.out.print("数値を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        if(num1 >= 60) {
            System.out.println("合格です");
        } else {
            System.out.println("不合格です");
        }

        sc.close();
    }
}
