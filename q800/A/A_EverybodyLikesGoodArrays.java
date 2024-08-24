package q800.A;

import java.util.Scanner;

public class A_EverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int count = 0;
            boolean currEven = true;
            if(arr[0] % 2 != 0) {
                currEven = false;
            }

            for(int j = 0; j < arr.length - 1; j++) {
                int nextEle = arr[j + 1];
                boolean nextEven = true;
                if(nextEle % 2 != 0) {
                    nextEven = false;
                }

                if(currEven == nextEven) {
                    if(!currEven) {
                        currEven = false;
                    }
                    count++;
                } else {
                    currEven = !currEven;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
