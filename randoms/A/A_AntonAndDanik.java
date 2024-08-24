package A;

import java.util.Scanner;

public class A_AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();

        int countA = 0;
        int countD = 0;
        for (int i = 0; i < num; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                countA++;
            } else {
                countD++;
            }
        }
        if (countA > countD) {
            System.out.println("Anton");
        } else if (countD > countA) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        sc.close();
    }
}
