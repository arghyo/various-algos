import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maximizeProfit(int[] b, int length) {
        Arrays.sort(b);
        return b[length-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        //Currency value 
        int[] b = new int[n+1];
        for(int b_i = 0; b_i < n; b_i++){
            b[b_i] = in.nextInt()*a[b_i]*m;
        }
        b[n]=m*k;
        int result = maximizeProfit(b, b.length);
        System.out.println(result);
        in.close();
    }
}
