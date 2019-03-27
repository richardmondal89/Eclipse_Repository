package com.rm.codejam;

import java.util.Scanner;

/**
 * 
 * @author rimondal
 *
 */
public class TidyNumbers {

	public static void main(String[] args) {
		
		int T;
		Long N;
		Long result[];
		String st;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		result = new Long[T];
		for(int i=0;i<T;i++){
			st = sc.next();
			N = Long.parseLong(st);
			while(N>0){
				if(findTidy(N)){
					break;
				}
				System.out.println(N);
				N--;
				
			}
			result[i]=N;
		}
		for(int i=0;i<T;i++){
			System.out.println("Case #"+(i+1)+": "+result[i]);
		}
	}

	private static boolean findTidy(long n) {
		// TODO Auto-generated method stub
		String s = Long.toString(n);
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)>s.charAt(i+1)){
				return false;
			}
		}
		return true;
	}

}
