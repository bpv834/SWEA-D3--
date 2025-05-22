import java.util.Arrays;
import java.util.Scanner;

public class swea10965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] powArr = new int[3200];

        for (int i = 1; i < powArr.length; i++) {
            powArr[i] = (int) Math.pow(i, 2);
        }
      /*  System.out.println(Arrays.toString(powArr));*/

        for (int t = 1; t <= T; t++) {
            int num = sc.nextInt();
            int ans=1;
           for(int i= powArr.length-1; i>0; i--){
               if(num%powArr[i]==0) {
                   ans = num/powArr[i];
                   break;
               }
           }
            System.out.println("#"+t+" "+ans);


        }
    }
}
