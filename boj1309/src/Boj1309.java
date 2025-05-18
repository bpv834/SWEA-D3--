import java.util.Scanner;

public class Boj1309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][3];
        int mod = 9901;

        dp[0][0] = dp[0][1] = dp[0][2] = 1;

        for (int i = 1; i < n; i++) {
            dp[i][0]=(dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%mod;
            dp[i][1] = (dp[i-1][0]+dp[i-1][2])%mod;
            dp[i][2] = (dp[i-1][0]+dp[i-1][1])%mod;
        }
        int a = dp[n-1][1]%mod;
        int b = dp[n-1][2]%mod;
        int c = dp[n-1][0]%mod;
        System.out.println((a+b+c)%mod);
    }
}
