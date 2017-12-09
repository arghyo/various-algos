
public class Solution {

	private static int gcd(int a, int b) {
	    int t;
	    while(b != 0){
	        t = a;
	        a = b;
	        b = t%b;
	    }
	    return a;
	}
	
	private static boolean relativelyPrime(int a, int b) {
	    return gcd(a,b) == 1;
	}
	
	
	public static void main(String []args) {
		System.out.println(gcd(16,6));
	}
	
}
