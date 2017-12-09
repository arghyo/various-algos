import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        sin.nextLine();
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i]=sin.nextLine();
        }
        int key = sin.nextInt();
        boolean reverse = sin.nextBoolean();
        String comp = sin.next();
        sin.close();
        
       if(comp.equalsIgnoreCase("lexicographic")) {
        	TreeMap<String,String> hm=new TreeMap<String,String>();
            for(int i=0; i<n; i++) {
            	hm.put(s[i].split(" ")[key-1], s[i]);
            }
            if(reverse) {
	            for(Map.Entry m:hm.descendingMap().entrySet()){  
	               System.out.println(m.getValue());  
	            }
            }else {
            	for(Map.Entry m:hm.entrySet()){  
 	               System.out.println(m.getValue());  
 	            }
            }
        }
        else{
        	TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
            for(int i=0; i<n; i++) {
            	hm.put(Integer.parseInt(s[i].split(" ")[key-1]), s[i]);
            }
            if(reverse) {
	            for(Map.Entry m:hm.descendingMap().entrySet()){  
	               System.out.println(m.getValue());  
	            }
            }else {
            	for(Map.Entry m:hm.entrySet()){  
 	               System.out.println(m.getValue());  
 	            }
            }
        }
    }
}