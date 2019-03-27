package com.rm.hackerRank.first;

import java.util.Scanner;

public class SuperReducedString {

	static String super_reduced_string(String s){
		char value[] = new char[s.length()];
		int weight[] = new int[s.length()];
		StringBuilder returnString = new StringBuilder();
		int count =0;
		for(int i=0;i<s.length();i++){
			int index  = charPresent(value,s.charAt(i)); 
			if(index<0){
				value[count] = s.charAt(i);
				weight[count++] = 1;
			}
			else{
				weight[index] = weight[index] + 1;
			}
		}
		for(int i=0;i<value.length;i++){
			if(weight[i]%2 !=0){
				returnString.append(value[i]);
			}
		}
		return returnString.toString();
        // Complete this function
    }

    private static int charPresent(char[] value, char charAt) {
		// TODO Auto-generated method stub
    	for(int i=0;i<value.length;i++){
    		if(value[i]==charAt){
    			return i;
    		}
    	}
		return -1;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        if(result.isEmpty()){
        	System.out.println("Empty String");
        }
        else{
        	System.out.println(result);
        }
    }

}
