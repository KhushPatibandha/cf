import java.util.Scanner;

public class A_NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        k--;
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }

        if(arr[k] > 0) {
            count += k + 1;
            for(int i = k + 1; i < n; i++) {
                if(arr[i] > 0 && arr[i] >= arr[k]) {
                    count++;
                }
            }
        } else {
            for(int i = 0; i < k; i++) {
                if(arr[i] > 0 && arr[i] > arr[k]) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
