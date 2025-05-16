
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

public class Swea1244 {
    static String str;
    static int n;
    static int[] arr;
    static int max;


    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            max=0;
            str = sc.next();
            n = sc.nextInt();
            arr = new int[str.length()];

            for(int i=0;i<str.length();i++){
                arr[i] = str.charAt(i)-48;
            }

            Dfs(0,0);
            System.out.println("#"+test_case+" "+max);

        }
    }
    static void Dfs(int depth,int start){
        if(depth==n){
            StringBuilder sb =new StringBuilder();
            for(int x : arr){
                sb.append(x);
            }
            int number = Integer.parseInt(sb.toString());
            System.out.println("d==n depth= "+depth+" st (i)= "+start+" number= "+number);

            max = Math.max(max,number);

        }else{
            for(int i=start; i<arr.length-1; i++){
                for(int j= i+1; j<arr.length;j++){
                    System.out.println("depth= "+depth+" i= "+i+" j= "+j);
                    swap(i,j);
                    Dfs(depth+1,i);
                    swap(i,j);
                }
            }

        }
    }
    static void swap(int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
