package A;

import java.util.Scanner;

public class A_HayatoAndSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int[] arr = new int[k];
            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextInt();
            }

            int[] oddIdx = new int[3];
            int[] evenIdx = new int[k];

            int evenCount = 0;
            int oddCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    if (evenCount >= 2 && oddCount >= 1) {
                        break;
                    }
                    evenIdx[evenCount] = j;
                    evenCount++;
                } else {
                    if (oddCount >= 3) {
                        break;
                    }
                    oddIdx[oddCount] = j;
                    oddCount++;
                }
            }

            if (oddCount >= 3) {
                System.out.println("YES");
                System.out.println((oddIdx[0] + 1) + " " + (oddIdx[1] + 1) + " " + (oddIdx[2] + 1));
            } else if (evenCount >= 2 && oddCount >= 1) {
                System.out.println("YES");
                System.out.println(
                        (evenIdx[0] + 1) + " " + (evenIdx[1] + 1) + " " + (oddIdx[0] + 1));
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
