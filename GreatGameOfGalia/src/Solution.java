import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	private static int permuteHelper(int[] arr, int index, int totalAmount){
		//int totalAmount=0;
	    if(index >= arr.length - 1){ 
	        Solution.Castle hall = new Solution.Castle();
	        int amount =0;
	        
	        for(int i=0; i<arr.length;i++) {
	        	
	        	amount=traverse(hall, arr[i], amount);
	        }
	        
	        totalAmount+=amount;
	        return totalAmount;
	    }else {

		    for(int i = index; i < arr.length; i++){ 
	
		        int t = arr[index];
		        arr[index] = arr[i];
		        arr[i] = t;
	
		        totalAmount=permuteHelper(arr, index+1, totalAmount);
	
		        t = arr[index];
		        arr[index] = arr[i];
		        arr[i] = t;
		    }
	    }
	    //System.out.println("final return total amount- "+ totalAmount);
		return totalAmount;
	}
	
	public static class Castle {
		int value=0;
		int visits=0;
		Solution.Castle left;
		Solution.Castle right;
		
		/*public Castle() {
			this.value=0;
			this.visits=0;
			this.left=new Castle();
			this.right=new Castle();
		}*/
		
	}
	
	public static int traverse(Castle c, int value, int amount) {
		//System.out.println("visited travese");
		//room visited. add visit
		//System.out.println("Visited node- "+c.value);
		c.visits+=1;
		
		if(c.visits == 2) {
			//System.out.println("subtracting value at node- "+ c.value);
			amount-=c.value;
		}
		
		if(c.value == 0) {
			//System.out.println("Staying here. Value is 0 at this node.");
			c.value = value;
			c.right = new Solution.Castle();
			c.left = new Solution.Castle();
		}
		else {
			if(value > c.value) {
				//System.out.println("Taking a right. Value is greater");
				//c.right = new Solution.Castle();
				amount=traverse(c.right, value, amount);
			}
			else if(value < c.value) {
				//System.out.println("Taking a left. Value is lesser");
				//c.left = new Solution.Castle();
				amount=traverse(c.left, value, amount);
			}
		}
		
		if(c.visits == 1) {
			//System.out.println("adding value at node- "+ c.value);
			amount+=c.value;
		}
		
		
		
		//System.out.println("amount in traverse- "+amount);
		return amount;
	}
	
    static void expectedAmount(int[] a) {
    	int amount=0;
    	amount=permuteHelper(a,0,amount);
    	int denominator=fact(a.length);
    	int divisor=gcd(amount,denominator);
    	if(amount==denominator)
    		System.out.println("1");
    	else
    		System.out.println(amount/divisor+"/"+denominator/divisor);
        
    }
    
    public static int fact(int n) {
    	if(n==0)
    		return 1;
    	
    	return n*fact(n-1);
    }
    
    private static int gcd(int a, int b) {
	    int t;
	    while(b != 0){
	        t = a;
	        a = b;
	        b = t%b;
	    }
	    return a;
	}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            //array of alice's gold
            expectedAmount(a);
        }
        in.close();
    }
}
