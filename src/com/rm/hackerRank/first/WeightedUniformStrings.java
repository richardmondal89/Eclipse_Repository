package com.rm.hackerRank.first;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        char chars[] = s.toCharArray();
        Set<Integer> resultSet = new HashSet<Integer>();
        Arrays.sort(chars);
        int l = chars.length;
        char currentChar = chars[0];
        int size=1;
        resultSet.add((currentChar+1-'a')*size);
        for(int i=1;i<l;i++){        	
        	if(currentChar == chars[i]){
        		size++;
        		resultSet.add((currentChar+1-'a')*size);
        	}
        	else{
        		currentChar = chars[i];
        		size =1;
        		resultSet.add((currentChar+1-'a')*size);
        	}
        	
        }
            
        int n = in.nextInt();       
        
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            // your code goes here
            if(resultSet.contains(x)){
            	System.out.println("Yes");
            }
            else{
            	System.out.println("No");
            }
        }

	}

}
