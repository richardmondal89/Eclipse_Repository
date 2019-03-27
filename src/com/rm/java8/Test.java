package com.rm.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Test {
	 static int sockMerchant(int n, int[] ar) {
		// Complete this function
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        Math mth;
	        Stack<Integer> st = new Stack<>();
	        for(int a:ar){
	            int count=1;
	            if(null!=map.get(a)){
	               count =  map.get(a)+1;
	            }
	            map.put(a,count);
	        }
	        int  result =0;
	        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
	            result =result+entry.getValue()%2;
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = sockMerchant(n, ar);
	        System.out.println(result);
	    }
}
