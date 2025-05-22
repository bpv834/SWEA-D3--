import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Swea2805 {
    static BufferedReader br;
    static int[][] farm;
    static int n;

    public static void main(String[] args) throws IOException {
        br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            n= Integer.parseInt(br.readLine());
            farm= new int[n][n];
            int half = n/2;
            int sum=0;

            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                for (int j = 0; j < n; j++) {
                    farm[i][j] = str.charAt(j)-'0';
                }
            }

        /*    for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(farm[i]));
            }
*/


            for (int i = 0; i < half; i++) {
                for (int j = half - i; j < half + i + 1; j++) {
                    sum= sum+farm[i][j]+ farm[n-i-1][j];
                }
                /*System.out.println("sum= "+sum);*/
            }

            for (int i = 0; i < n; i++) {
                sum+= farm[half][i];
            }

            System.out.println("#"+t+" "+sum);
        }

    }

}
