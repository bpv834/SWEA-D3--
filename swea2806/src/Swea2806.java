import java.util.Arrays;
import java.util.Scanner;

public class Swea2806 {
    static int[][] board;
    static int n;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        answer=0;
        dfs(0);
        System.out.println(answer);



    }


    static void dfs(int L) {
        if(L==n){
            answer++;
        }else {
            for (int i = 0; i < n; i++) {
                if (isPossible(L, i)) {
                    board[L][i] =1;
                    dfs(L+1);
                    board[L][i]=0;
                }
            }



        }
    }

    static boolean isPossible(int y, int x) {
        // 열체크
        for (int i = 0; i < n; i++) {
            if(board[i][x] ==1) return false;
        }

        // 대각체크
        int diff = x-y;
        int sum = x+y;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j-i == diff && board[i][j] ==1) return false;
                if(j+i == sum && board[i][j] ==1 )return false;
            }
        }

        return true;
    }
}