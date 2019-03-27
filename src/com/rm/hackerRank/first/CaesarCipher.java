package com.rm.hackerRank.first;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        StringBuilder newString = new StringBuilder();
        for(int i=0;i<n;i++){
        	char c = s.charAt(i);
        	int add = k%26;
        	if(Character.isUpperCase(c) || Character.isLowerCase(c)){
        		if(Character.isUpperCase(c)){
        			if(Character.isUpperCase((char)(c+add))){
        				newString.append((char)(c+add)); 
        			}
        			else{
        				newString.append((char)('A'+(add-1-('Z'-c))));
        			}
        		}
        		else if(Character.isLowerCase(c)){
        			if(Character.isLowerCase((char)(c+add))){
        				newString.append((char)(c+add)); 
        			}
        			else{
        				newString.append((char)('a'+(add-1-('z'-c))));
        			}
        		}
        	}
        	else{
        		newString.append(c);
        	}
        }
        
        System.out.println(newString.toString());

	}

}
