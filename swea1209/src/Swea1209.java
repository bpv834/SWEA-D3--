import java.util.Scanner;

public class Swea1209 {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[100][100];

        for (int t = 0; t < 10; t++) {
            int tc = sc.nextInt();

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int ans = Math.max(Math.max(Math.max(calcRow(), calcColumn()), calcLToRDiagonal()), calcRToLDiagonal());
            System.out.println("#"+tc+" "+ans);


        }
    }

    static int calcRow() {
        int max=0;
        for (int i = 0; i < 100; i++) {
            int rowSum=0;
            for (int j = 0; j < 100; j++) {
                rowSum+=arr[i][j];
            }
            max = Math.max(max, rowSum);
        }
        return max;
    }

    static int calcColumn() {
        int max=0;
        for (int i = 0; i < 100; i++) {
            int colSum =0;
            for (int j = 0; j < 100; j++) {
                colSum+= arr[j][i];
            }
            max = Math.max(max, colSum);
        }
        return max;
    }

    static int calcLToRDiagonal() {
        int max =0;
        for (int i = 0; i < 100; i++) {
         max+=arr[i][i];
        }
        return max;
    }

    static int calcRToLDiagonal() {
        int max =0;
        for (int i = 0; i < 100; i++) {
            max+=arr[i][100-(i+1)];
        }
        return max;
    }
}
