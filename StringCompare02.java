package kadai0417;

import java.time.Year;
import java.util.Scanner;
public class StringCompare02 {
    public static void main(String[] args) {

        var sc1 = new Scanner(System.in);
        var s1 = sc1.nextLine();

        var sc2 = new Scanner(System.in);
        var s2 = sc2.nextLine();

        sc1.close();
        sc2.close();

        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("入力値が一致しました");
        } else {
            System.out.println("入力値が一致しません");
        }
    }
}