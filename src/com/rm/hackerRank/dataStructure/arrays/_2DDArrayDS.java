package com.rm.hackerRank.dataStructure.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2DDArrayDS {
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        int Q = in.nextInt();
	        
	        int [][] list = new int[N][N];
	        for(int i=0;i<N;i++){
	        	for(int j=0;j<N;j++)
	        		list[i][j] = -1;
	        }
	        
	        int lastAnswer = 0;
	        for(int i=0;i<Q;i++){
	            int query = in.nextInt();
	            int x = in.nextInt();
	            int y = in.nextInt();
	            if(1==query){
	                int index = (x^lastAnswer)%N;
	                add(list[index],y);	                
	            }
	            else if(2==query){ 
	               int index = (x^lastAnswer)%N;
	               int seq[] = list[index];
	               
	               lastAnswer =seq[y%getLength(seq)];
	               System.out.println(lastAnswer);
	            }
	        }
	 }

	private static int getLength(int[] is) {
		// TODO Auto-generated method stub
		for(int i=0;i<is.length;i++)
			if(is[i]==-1)
				return i;
		return is.length;
	}

	private static void add(int[] is, int y) {
		// TODO Auto-generated method stub
		for(int i=0;i<is.length;i++){
			if(is[i]==-1){
				is[i] = y;
				break;
			}
		}
	        
	}
}
