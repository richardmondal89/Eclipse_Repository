package com.rm.hackerEarth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		int l = S.length();
		String check = null;
		Set<Long> set = new HashSet<Long>();
		for(int i=0;i<=l;i++){
			
			for(int j=i+1;j<l;j++){
				check =S.substring(i, i+1);
				if(j<l){
					check = check + S.substring(j,l);
				}
				if(j-i >1){
					check = check + S.substring(i+1,j);
				}
				if(i>0){
					check  = check + S.substring(0,i);
				}
				//System.out.println(check + " : "+convertToNum(check));
				System.out.println(check + ": "+check.hashCode());
				set.add(convertToNum(check));
			}
			
		}
		
		System.out.println(set.size());

	}
	
	private static long convertToNum(String str){
		long l = 0;
		for(int i=0;i<str.length();i++){
			l=l+i*str.charAt(i);
		}
		
		return l;
	}

}
