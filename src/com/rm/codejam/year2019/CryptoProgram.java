package com.rm.codejam.year2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CryptoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		long arr[] , N;
		int L;
		for(int i=0;i<T;i++){
			N = sc.nextLong();
			L = sc.nextInt();
			arr = new long[L];
			for(int j=0;j<L;j++){
				arr[j] = sc.nextLong();
			}
			printCryptoMessage(arr,i);
		}
		
		
	}

	private static void printCryptoMessage(long[] arr, int i2) {
		// TODO Auto-generated method stub
		long[] copyArr =  new long[arr.length];
		int count =0;
		int position=0;
		long min = arr[position];
		for(long l : arr){
			if(l<min){
				position = count;
				min =l;
			}
			copyArr[count++] = l;
		}
		Arrays.sort(arr);
		Set<Long> alphaPrime = new HashSet<Long>();
		long check =arr[0];
		long fwd=0,back=0;
		for(int i=1;i<check;i++){
			if(check%i==0){
				fwd=0;back=0;
				alphaPrime.clear();
				fwd = checkforCorrectPrime(copyArr,position,i,alphaPrime);
				if(fwd == -1)
					continue;
				alphaPrime.clear();
				back = checkforCorrectPrime(copyArr,position,i,alphaPrime);
				if(fwd!=0 && back!=0){
					if(checkprime(i) && checkprime(check/i)){
						addToTheLookUpArray(alphaPrime,i,copyArr,back,i2);
						break;
					}
				}
			}
		}
		
		
		
	}

	private static void addToTheLookUpArray(Set<Long> alphaPrime, int i, long[] copyArr, long back,int i2) {
		// TODO Auto-generated method stub
		long lon = back;
		List<Long> aList = new ArrayList<Long>(alphaPrime); 
		Collections.sort(aList);
		char c='A';
		Map<Long, Character> map = new HashMap<Long, Character>();
		for(long l: aList){
			map.put(l, c++);
		}
		StringBuilder str = new StringBuilder();
		for(long i1:copyArr){
			str.append(map.get(lon));
			lon = i1/lon;
		}
		str.append(map.get(lon));
		System.out.println("Case #"+(i2+1)+": "+ str.toString());
	}

	private static boolean checkprime(long n) {
		// TODO Auto-generated method stub// Corner cases 
        if (n <= 1) return false; 
        if (n <= 3) return true; 
      
        // This is checked so that we can skip  
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) return false; 
      
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
      
        return true; 
	}

	private static long checkforCorrectPrime(long[] copyArr, int position, long check, Set<Long> alphaPrime) {
		// TODO Auto-generated method stub
		int count=position+1,size = copyArr.length;
		long intialCheck = check;
		alphaPrime.add(check);
		while(count<size){
			if(copyArr[count] % check !=0 ){
				return   -1;
			}
			check =  copyArr[count]/check;
			alphaPrime.add(check);
			count++;
		}
		count = position-1;
		check = copyArr[position]/intialCheck;
		alphaPrime.add(check);
		while(count>=0){
			if(copyArr[count] % check !=0 ){
				return -1;
			}
			check =  copyArr[count]/check;
			alphaPrime.add(check);
			count --;
		}
		return check;
	}
	
	

}
