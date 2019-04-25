package com.rm.codejam.year2018.practice;

import java.util.Scanner;

class CruiseControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T,N,D;
		T = sc.nextInt();
		for(int i=0;i<T;i++){
			D = hasNext(sc);
			N = hasNext(sc);
			int K[] = new int[N];
			int S[] = new int[N];
			for(int j=0;j<N;j++){
				K[j] = hasNext(sc);
				S[j] = hasNext(sc);
			}
			//markCompleted(K,D);
			int count=0;
			while(true){
				if(updatePosition(K,S,D)){
					break;
				}
				else{
					count++;
				}
			}
			System.out.println("Case #"+(i+1)+": "+(float)D/(float)count);
		}
		
	}

	private static boolean updatePosition(int[] k, int[] s, int d) {
		// TODO Auto-generated method stub
		boolean flag = true;
		for(int i=0;i<k.length;i++){
			if(k[i]<d){
				k[i] = k[i]+s[i];
				flag = false;
			}
		}
		if(flag)
			return flag;
		
		for(int i=0;i<k.length;i++){
			int dis = k[i];
			for(int j=i+1;j<k.length && dis<=d;j++){
				if(dis==k[j]){
					if(s[i]>s[j]){
						s[i] = s[j];
					}
					else{
						s[j] = s[i];
					}
				}
			}
		}
		
			return flag;
	}
	
	private static int hasNext(Scanner sc){
		if(sc.hasNext())
		return Integer.parseInt(sc.next());
		else 
			return 0;
	}
}
