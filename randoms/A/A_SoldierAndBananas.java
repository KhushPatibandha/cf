package A;

import java.util.Scanner;

public class A_SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costOfFirstBanana = sc.nextInt();
        int initialDollars = sc.nextInt();
        int bananasWant = sc.nextInt();

        int totalCost = 0;

        for (int i = 1; i <= bananasWant; i++) {
            totalCost += costOfFirstBanana * i;
        }
        int res = totalCost - initialDollars;
        if (res <= 0) {
            System.out.println("0");
        } else {
            System.out.println(res);
        }
        sc.close();
    }
}
