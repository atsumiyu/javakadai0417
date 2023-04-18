package kadai0417;

import java.util.Scanner;
public class IfPractice03 {
    public static void main(String[] args) {
        System.out.print("数値を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        if(num1 >= 60 && num1 % 2 == 0) {
            System.out.println(num1);
        } else {
            System.out.println();
        }

        sc.close();
    }
}