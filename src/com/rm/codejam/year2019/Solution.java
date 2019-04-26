package com.rm.codejam.year2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution{
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		Scanner sc = new Scanner(System.in);
    		int T = Integer.parseInt(sc.nextLine()),N=0;
    		String arr[] = new String[T];
    		String path;
    		for(int i=0;i<T;i++){
    			N=sc.nextInt();
    			path = sc.next();
    			arr[i] = printAlterPath(path,N,i);
    		}
    		for(int i=0;i<T;i++)
    			System.out.println("Case #"+(i+1)+": "+arr[i]);
    	}
		private static String printAlterPath(String path, int n, int t) {
			// TODO Auto-generated method stub
			List <int[]> list= getBestPathoftheArray(n);
			
			int arrR[] = list.get(0);
			int arrC[] = list.get(1);
			int l = n*n-2;
			StringBuilder newPath = new StringBuilder();
			int row=0,col=0,newR=0,newC=0,lookUpR =0,lookUpC=0,prevR=-1,prevC=-1,tempR,tempC;
			char current ;
			for(int i=0;i<l;i++){
				current = path.charAt(i);
				tempR=0;tempC=0;
				
				if('E' == current){
					col++;
				}
				else{
					row++;
				}
				if((newR == n-1 && newC == n-2)){
					newPath.append("E");
					break;
				}
				else if((newC == n-1 && newR == n-2)){
					newPath.append("S");
					break;
				}
				if((newR==prevR && newC == prevC) || (prevR==-1)){
					if('E' == current){
						newPath.append("S");
						newR++;
					}
					else{
						newPath.append("E");
						newC++;
					}
					prevR =row;prevC=col;
				} 
				else{
					lookUpR = arrR[i+1];
					lookUpC = arrC[i+1];
					if(newR+1<n){
						tempR = newR+1;
						if(tempR == lookUpR){
							newPath.append("S");
							newR++;
							prevR =row;prevC=col;
							continue;
						}
						
					}
					if((newC+1)<n){
						tempC=newC+1;
						if(tempC == lookUpC ){
							newPath.append("E");
							newC++;
							prevR =row;prevC=col;
							continue;
						}
					}
					
					if((newR+1)<n){
						tempR=newR+1;
						tempR = tempR - lookUpR;
					}
					if(newC+1<n){
						tempC = newC+1;
						tempC = tempC-lookUpC;
					}
					if(tempC<=tempR){
						newPath.append("E");
						newC++;
						prevR =row;prevC=col;
						continue;
					}
					else{

						newPath.append("S");
						newR++;
						prevR =row;prevC=col;
						continue;
					}
				}
				
			}
			return newPath.toString();
			
		}
		private static List <int[]> getBestPathoftheArray(int n) {
			// TODO Auto-generated method stub
			StringBuilder str = new StringBuilder();
			List <int[]> list = new ArrayList<int[]>();
			n = n*2-2;
			int arrC[] = new int[n];
			int arrR[] = new int[n];
			arrC[0] = arrR[0] = 0;
			int prevR=0,prevC=0;
			for(int i=1;i<n;i++){
				if(i%2==0){
					arrR[i] = prevR + 1;
					prevR = arrR[i];
					arrC[i] = prevC;
				}
				else{
					arrC[i] = prevC + 1;
					prevC = arrC[i];
					arrR[i] = prevR;
				}
			}
			list.add(arrR);
			list.add(arrC);
			return list;
		}
}