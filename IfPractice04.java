package kadai0417;

import java.time.Year;
import java.util.Scanner;
public class IfPractice04 {
    public static void main(String[] args) {
        System.out.print("数値を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        if(num1 % 4 == 0) {
            if(num1 % 400 == 0){
                System.out.println("閏年です");
            } else if(num1 % 100 == 0){
                System.out.println();
            } else {
                System.out.println("閏年です");
            }
        } else {
            System.out.println();
        }

        sc.close();
    }
}