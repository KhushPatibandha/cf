package cp31.q800;
import java.util.Scanner;

public class C_TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < 10; j++) {
                sb.append(sc.next());
            }

            int totalPoints = 0;
            for(int j = 0; j < 100; j++) {
                if(sb.charAt(j) == 'X') {
                    int row = j / 10;
                    int col = j % 10;
                    int ring = Math.min(
                        Math.min(row, 9 - row),
                        Math.min(col, 9 - col)
                    );
                    totalPoints += ring + 1;
                }
            }
            System.out.println(totalPoints);
        }
        sc.close();
    }
}

