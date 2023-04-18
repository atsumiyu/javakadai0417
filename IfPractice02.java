package kadai0417;

import java.util.Scanner;
public class IfPractice02 {
    public static void main(String[] args) {
        System.out.print("数値を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        if(100 >= num1 && num1 >= 80) {
            System.out.println("A評価です");
        } else if(80 > num1 && num1 >= 60) {
            System.out.println("B評価です");
        } else if(60 > num1 && num1 >= 40) {
            System.out.println("C評価です");
        } else if(40 > num1 && num1 >= 20) {
            System.out.println("D評価です");
        } else {
            System.out.println("E評価です");
        }

        sc.close();
    }
}