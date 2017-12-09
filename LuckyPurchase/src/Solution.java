import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tot = in.nextInt();
        TreeMap<Integer,String> cand = new TreeMap<Integer,String>();
        
        for(int a0 = 0; a0 < tot; a0++){
            String s = in.next();
            int n = in.nextInt();
            int i=10;
            int fs=0;
            int ss=0;
            if(n%10==4){
            	//System.out.println("last digit is 4");
                fs+=1;
            }else if(n%10==7){
            	//System.out.println("last digit is 7");
                ss+=1;
            }else
                continue;
            
            while(n/i != 0){
                
                if((n/i)%10==4)
                    fs+=1;
                else if((n/i)%10==7)
                    ss+=1;
                else
                    break;
                
                i*=10;
            }
            
            //System.out.println("n="+n+" fs- "+fs);
            //System.out.println("n="+n+" ss- "+ss);
            if(fs==ss)
                cand.put(n, s);
        }
        if(cand.size() == 0)
            System.out.println("-1");
        else {
            System.out.println(cand.get(cand.firstKey()) );
        }
        
        /*for(Map.Entry<Integer, String> m: cand.entrySet()) {
        	System.out.println(m.getValue()+": " +m.getKey());
        }*/
        in.close();
    }
}
