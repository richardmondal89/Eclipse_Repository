package com.rm.hackerRank.dataStructure.stack;

import java.util.Scanner;

public class GameofTwoStacks {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            // your code goes here
            int sum=0,st1=0,st2=0,count=0;
            while(sum<x && (st1<n || st2<m)){
            	if((st2==m && st1<n) || a[st1]<b[st2] ){
            		if(sum+a[st1] >x){
            			break;
            		}
            		sum = sum+a[st1];
            		st1++;
            		count++;
            	}
            	else if((st1==n && st2<m) || a[st1]>=b[st2]){
            		if(sum+b[st2] >x){
            			break;
            		}
            		sum = sum+b[st2];
            		st2++;
            		count++;
            	}
            }
            System.out.println(count);
        }
    }

}
