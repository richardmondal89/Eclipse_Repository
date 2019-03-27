package com.rm.codejam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevengeOfPancakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int T;
		List<Integer> list = new ArrayList<Integer>();
		String s;
		List<Boolean> array = new ArrayList<Boolean>();
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for(int i=0;i<T;i++){
			
			s = sc.next();
			array.clear();
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='+'){
					array.add(j, true);
				}
				else{
					array.add(j, false);
				}
			}
			
			int count=0;
			while(true){
				int j=array.size()-1;
				for(;array.get(j) && j>0;j--){
					array.remove(j);
				}
				if(j==0){
					if(!array.get(j))
						list.add(i, ++count);
					else
						list.add(i, count);
					break;
				}
				//special case
				if(array.get(0)!= array.get(j)){
					int k=j;
					for(;k>0 && array.get(0)!= array.get(k);k--);
					
					if(k==0){
						list.add(i, (count+2));
						break;
					}
					
					array = shuffleAndAdd(j,k,array);
				}
				else{
					
					array = shuffleAndAdd(j, j, array);
				}
				count++;
				
			}
			
			
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println("Case #"+(i+1)+": "+list.get(i));
		}
		
		
	}

	private static List<Boolean> shuffleAndAdd(int j, int k, List<Boolean> array) {
		// TODO Auto-generated method stub
		List<Boolean> temp = new ArrayList<Boolean>();
		for(int i=0;i<=k;i++){
			temp.add(i, !array.get(k-i));
		}
		
		if(j!=k){
			
			for(int i=k+1;i<=j;i++){
				temp.add(i, array.get(i));
			}
		}
		return temp;
			
	}

}
