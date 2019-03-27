package com.rm.hackerRank.first;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StairCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = n; i >=1; i--) {
			for(int j=1;j<=n;j++){
				if(j<i){
					System.out.print(" ");					
				}
				else{
					System.out.print("#");
				}
			}
			System.out.println();	
		}

	}

}
