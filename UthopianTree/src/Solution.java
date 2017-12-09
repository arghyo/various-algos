import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int output[] = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int height=1;
            int n = in.nextInt();
            for(int i=0;i<=n;i++){
                if(i%2==1)
                    height*=2;
                if(i%2==0 && i!=0)
                    height+=1;
            }
            output[a0]=height;
        }
        for(int i=0;i<t;i++){
            System.out.println(output[i]);
        }
    }
}
