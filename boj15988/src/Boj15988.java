import java.util.Scanner;

public class Boj15988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000009;
        int n = sc.nextInt();
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < dp.length; i++) {
            dp[i] = (dp[i-3]+dp[i-2]+dp[i-1])%mod;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(dp[sc.nextInt()]);
        }

    }
}
