import java.util.Scanner;

public class Boj1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr =new int[n][3];
        int[][] dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int num =sc.nextInt();
                if(i==0) dp[i][j] = num;
                arr[i][j] = num;
            }
        }


        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + arr[i][2];
        }

/*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
*/


        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            ans = Math.min(dp[n-1][i],ans);
        }
        System.out.println(ans);

    }
}
