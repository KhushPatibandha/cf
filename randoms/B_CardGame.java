import java.util.Scanner;

public class B_CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int[] arr = new int[4];
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int count = 0;

            if ((a1 > b1 && a2 >= b2) || (a1 >= b1 && a2 > b2)) {
                count += 2;
            }
            if ((a1 > b2 && a2 >= b1) || (a1 >= b2 && a2 > b1)) {
                count += 2;
            }

            System.out.println(count);
        }
        sc.close();
    }
}
