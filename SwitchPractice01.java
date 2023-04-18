package kadai0417;

import java.time.Year;
import java.util.Scanner;
public class SwitchPractice01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        switch (s1) {
            case "赤" -> System.out.println("赤ですね。進んではいけません。");
            case "黄" -> System.out.println("黄ですね。止まっていください。");
            case "青" -> System.out.println("青ですね。進んでください。");
            default -> System.out.println("赤、青、黄のいずれかを選択してください。");
        }

        sc.close();
    }
}