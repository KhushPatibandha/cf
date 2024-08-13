package contest.c2000;

import java.util.ArrayList;
import java.util.Scanner;

public class D_RightLeftWrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String str = sc.next();

            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int l = 0;
            int r = str.length() - 1;
            while(l < r) {
                if(str.charAt(l) == 'L' && str.charAt(r) == 'R') {
                    ArrayList<Integer> li = new ArrayList<>();
                    li.add(l);
                    li.add(r);
                    list.add(li);
                    l++;
                    r--;
                }
                while(r > 0 && str.charAt(r) != 'R') {
                    r--;
                }
                while(l < str.length() - 1 && str.charAt(l) != 'L') {
                    l++;
                }
            }
            int total = 0;
            for(int i = 0; i < list.size(); i++) {
                ArrayList<Integer> list2 = list.get(i);
                int left = list2.get(0);
                int right = list2.get(1);
                int sum = 0;
                for(int k = left; k <= right; k++) {
                    sum += arr[k];
                }
                total += sum;
            }
            System.out.println(total);
        }
        sc.close();
    }
}
// LLRLRRR
// 0, 6
// 1, 5
// 3, 4