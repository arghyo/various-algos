package com.arghyo;

import java.util.*;

public class Factorials {
	
	public Map<Integer, Integer> facts = new HashMap<Integer,Integer>();

	public static void main(String[] args) {
		Factorials f = new Factorials();
		int n = 4;
		
		if(f.facts.containsKey(n))
			System.out.println(f.facts.get(n));
		else {
			f.facts.put(n, f.factorials(n));
			System.out.println(f.facts.get(n));
		}
		

	}
	
	public int factorials(int n) {
		
		if(n==0)
			return 1;
		else
			return n*factorials(n-1);
	}

}
