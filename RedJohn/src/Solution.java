import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public Map<Integer,Long> factorial = new HashMap<Integer,Long>();
    public Map<Integer, Boolean> primes = new HashMap<Integer, Boolean>();

    public static void main(String[] args) {        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sin = new Scanner(System.in);
        int lineNum = sin.nextInt();
        Solution s = new Solution();
        int arrayInt[] = new int[lineNum];
        
        for (int i=0; i<lineNum; i++){
            int n = sin.nextInt();
            int y = n/4;
            int x = n%4;
            arrayInt[i]=s.calculatePrimes(s.calculatePerms(n));            
        }
        for(int i=0; i<lineNum; i++) {
        	System.out.println(arrayInt[i]);
        }
        sin.close();
    }
    
    public long factorials(long n,int limit){
        if(n==0)
            return 1;
        else if(n==limit)
        	return 1;
        else
            return n*factorials(n-1,limit);
    }
    
    public int calculatePerms(int columns){
        int total=0;
        int maxY = columns/4;
        for(int i=0; i<=maxY; i++){
            int x = columns - (i*4);
            if(i==0)
                total+=1;
            else if(x==0)
                total+=1;
            else{
                long factTot=0;
                long factY=0;
                long factX=0;
                
                //Limit to reduce the number of computations
                int factLimit = 0;
                if(x>i)
                	factLimit=x;
                
                //Total
                //if(this.factorial.containsKey(x+i))
                    //factTot=this.factorial.get(x+i);
                //else{
                    //this.factorial.put(x+i, this.factorials(x+i,factLimit));
                    //factTot=this.factorial.get(x+i);
                //}
                factTot=this.factorials(x+i,factLimit);
                //X
                if(factLimit == 0) {
	                /*if(this.factorial.containsKey(x))
	                    factX=this.factorial.get(x);
	                else{
	                    
                		this.factorial.put(x, this.factorials(x,factLimit));
	                    factX=this.factorial.get(x);
	                //}*/
                	factX=this.factorials(x,factLimit);
                }
                //Y
                /*if(this.factorial.containsKey(i))
                    factY=this.factorial.get(i);
                else{
                    this.factorial.put(i, this.factorials(i,factLimit));
                    factY=this.factorial.get(i);
                }*/
                factY=this.factorials(i,factLimit);
                
                if(factLimit==0)
                	total+=factTot/(factX*factY);
                else
                	total+=factTot/factY;
            }
        }
        return total;
    }
    
    public int calculatePrimes(int num){
        int total=0;
        //First prime is 2 and we are checking from 3
        if(num>1)
            total=1;
        
        for(int i=3; i<=num;i+=2){
            if(this.primes.containsKey(i) && this.primes.get(i))
                total+=1;
            else{
                boolean isIPrime = this.isPrime(i); 
                this.primes.put(i,isIPrime);
                if(isIPrime)
                    total+=1;
            }
        }
        return total;
    }
    
    public boolean isPrime(int n){
        if(n%2==0)
            return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }
}