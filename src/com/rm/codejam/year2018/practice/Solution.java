package com.rm.codejam.year2018.practice;
import java.io.*;
import java.util.*;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Scanner sc = new Scanner(System.in);
		int t,a,b,n;
		t= sc.nextInt();
		for (int i=0;i<t;i++){
			a =sc.nextInt();
			b = sc.nextInt();
			n = sc.nextInt();
			int count=1;
			int g;
			String s;
			while(count<=n){
				g=(a+b+1)/2;
				System.out.flush();
				System.out.print(g);
								
				s = sc.next();
				if("CORRECT".equals(s)){
					break;
				}
				else if("TOO_SMALL".equals(s)){
					a = g+1;
				}
				else if("TOO_BIG".equals(s)){
					b=g-1;
				}
				else if("WRONG_ANSWER".equals(s)){
					System.exit(0);
				}
			}
		}
		}catch( Exception ex){
		    ex.printStackTrace();
		}

	}

}
