import java.util.Arrays;
import java.util.Scanner;

public class Swea5215 {

    static int n;
    static int limit;
    static int[][] arr;
    static int ans;
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            n=sc.nextInt();
            limit=sc.nextInt();
            arr = new int[n][2];
            ans=0;

            for(int i=0; i<n;i++){
                int score = sc.nextInt();
                int calories = sc.nextInt();
                arr[i][0] = score;
                arr[i][1] = calories;
            }
            dfs(0,0,0);
            System.out.println("#"+test_case+" "+ans);


        }
    }
    static void dfs(int st, int score, int curCal){
       // System.out.println("st= "+st+" score= "+score+ "curCal= "+curCal);
        if(curCal > limit) return;

        // 이전 재귀 까지의 점수 최대값 구하기
        ans = Math.max(ans, score);


        for(int i=st; i<n; i++){
            dfs(i+1, score+arr[i][0], curCal+arr[i][1]);
        }
    }
}
