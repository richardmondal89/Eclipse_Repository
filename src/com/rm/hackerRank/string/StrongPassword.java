package com.rm.hackerRank.string;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StrongPassword {
	
	static int minimumNumber(int n, String password) {
        boolean noflag = false,lowerCaseFlag = false,upperCaseFlag = false,specialFlag = false;
        // Return the minimum number of characters to make the password strong
        for(char c: password.toCharArray()){
        	if(c>='0' && c<='9'){
        		noflag = true;
        	}
        	else if(c>='a' && c<='z'){
        		lowerCaseFlag = true;
        	}
        	else if(c>='A' && c<='Z'){
        		upperCaseFlag = true;
        	}
        	else if(check(c)){
        		specialFlag = true;        		
        	}
        }
        int count =0;
        if(!noflag)
        	count++;
        if(!lowerCaseFlag)
        	count++;
        if(!upperCaseFlag)
        	count++;
        if(!specialFlag)
        	count++;
        if(password.length()<6){
        	if(6-password.length() > count){
        		count = 6-password.length();
        	}        		
        }
        Math.floorMod(x, y)
		return count;
    }
	
	private static boolean check(char c){
        char[] special_characters = "!@#$%^&*()-+".toCharArray();
        for(int i=0;i<special_characters.length;i++){
        	if(c == special_characters[i])
        		return true;
        }
        return false;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }

}
