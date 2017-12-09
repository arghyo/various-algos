import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void tripleRecursion(int n, int m, int k) {
        int [][] arr = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    arr[i][j] = m;
                    System.out.print(arr[i][j]);
                }
                else if(i==j){
                    arr[i][j]=arr[i-1][j-1]+k;
                    System.out.print(arr[i][j]);
                }
                else if(i>j){
                    arr[i][j]=arr[i-1][j]-1;
                    System.out.print(arr[i][j]);
                }
                else if(i<j){
                    arr[i][j]=arr[i][j-1]-1;
                    System.out.print(arr[i][j]);
                }
                if(j!=n-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        tripleRecursion(n, m, k);
        in.close();
    }
}
