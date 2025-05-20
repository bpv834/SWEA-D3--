import java.util.Arrays;
import java.util.Scanner;

public class Swea5215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int material = sc.nextInt();
            int limit = sc.nextInt();

            int[][] arr = new int[material+1][2];
            int[] dp = new int[limit + 1];

            for (int i = 1; i <= material; i++) {
                for (int j = 0; j < 2; j++) {
                    int num = sc.nextInt();
                    arr[i][j] = num;
                }
            }
            for (int i = 1; i <= material; i++) {
                int score = arr[i][0];
                int cal = arr[i][1];

                for (int j = limit; j >= cal; j--) {
                    dp[j] = Math.max(dp[j], dp[j - cal] + score);
                }
            }
            System.out.println(Arrays.toString(dp));

        }
    }
}
