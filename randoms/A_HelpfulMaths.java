import java.util.Scanner;

public class A_HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[3];
        for(int i = 0; i < str.length(); i += 2) {
            arr[str.charAt(i) - '1']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < arr[i]; j++) {
                sb.append(i + 1);
                sb.append("+");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
        sc.close();
    }
}
