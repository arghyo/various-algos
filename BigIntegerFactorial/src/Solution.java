import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    static void factorial(int n){
        BigInteger b = new BigInteger("1");
        for(int i=2; i<=n; i++){
            b=b.multiply(BigInteger.valueOf(i));
        }
        System.out.println(b.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        factorial(n);
    }
}
