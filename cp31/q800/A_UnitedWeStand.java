package cp31.q800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            boolean allSame = false;
            for(int j = 0; j < n - 1; j++) {
                if(arr[j] != arr[j + 1]) {
                    allSame = false;
                    break;
                } else {
                    allSame = true;
                }
            }

            if(allSame) {
                System.out.println(-1);
                continue;
            }

            ArrayList<Integer> bArr = new ArrayList<>();
            ArrayList<Integer> cArr = new ArrayList<>();

            Arrays.sort(arr);
            int smallest = arr[0];
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == smallest) {
                    bArr.add(arr[j]);
                } else {
                    cArr.add(arr[j]);
                }
            }
            
            System.out.println(bArr.size() + " " + cArr.size());
            for(int j = 0; j < bArr.size(); j++) {
                System.out.print(bArr.get(j) + " ");
            }
            System.out.println();
            for(int j = 0; j < cArr.size(); j++) {
                System.out.print(cArr.get(j) + " ");
            }
        }
        sc.close();
    }
}
