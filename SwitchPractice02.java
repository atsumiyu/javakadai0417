package kadai0417;

import java.util.Scanner;
public class SwitchPractice02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        System.out.print("東京まで ");
        switch (s1) {
            case "品川":
                System.out.print("田町 ");
            case "田町":
                System.out.print("浜松町 ");
            case "浜松町":
                System.out.print("新橋 ");
            case "新橋":
                System.out.print("有楽町 を通過します");
        }

        sc.close();
    }
}