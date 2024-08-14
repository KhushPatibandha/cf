package cp31.q900;

import java.util.Scanner;

public class D_OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n + 1];
            int oddCount = 0;

            int[] oddCountArr = new int[n + 1];
            for(int i = 1; i <= n; i++) {
                oddCountArr[i] = oddCount;
                arr[i] = sc.nextInt();
                if(arr[i] % 2 != 0) {
                    oddCount++;
                }
            }

            // System.out.println("oddCount: " + oddCount);

            for(int j = 0; j < q; j++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                int localOddCount = oddCount;

                boolean kIsEven = true;
                if(k % 2 != 0) {
                    kIsEven = false;
                }

                int oddCountBetweenLAndR = oddCountArr[r] - oddCountArr[l];
                if(arr[r] % 2 != 0) {
                    oddCountBetweenLAndR++;
                }

                // System.out.println("add count before l: " + oddCountArr[l]);
                // System.out.println("add count before r: " + oddCountArr[r]);

                // System.out.println("odd count between l and r: " + oddCountBetweenLAndR);

                if(kIsEven) {
                    localOddCount -= oddCountBetweenLAndR;
                    oddCountBetweenLAndR = 0;
                } else {
                    localOddCount -= oddCountBetweenLAndR;
                    int window = r - l + 1;
                    localOddCount += window;
                    oddCountBetweenLAndR = window;
                }

                // System.out.println("updated odd count between l and r: " + oddCountBetweenLAndR);
                // System.out.println("local odd count: " + localOddCount);

                if(localOddCount % 2 == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}
