package com.rm.codejam;

import java.util.Random;
import java.util.Scanner;

/**
 * Problem

Alice likes reading and buys a lot of books. She stores her books in two boxes; each box is labeled with a pattern that matches the titles of all of the books stored in that box. 
A pattern consists of only uppercase/lowercase English alphabet letters and stars (*). A star can match between zero and four letters. For example, 
books with the titles GoneGirl and GoneTomorrow can be put in a box with the pattern Gone**, but books with the titles TheGoneGirl, and GoneWithTheWind cannot.

Alice is wondering whether there is any book that could be stored in either of the boxes. That is, she wonders if there is a title that matches both boxes' patterns.

Input

The first line of the input gives the number of test cases, T. T test cases follow. Each consists of two lines; each line has one string in which each character is either an uppercase/lowercase English letter or *.

Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is TRUE if there is a string that matches both patterns, or FALSE if not.

Limits

1 ≤ T ≤ 50.
Small dataset

1 ≤ the length of each pattern ≤ 200.
Each pattern contains at most 5 stars.
Large dataset

1 ≤ the length of each pattern ≤ 2000.
Sample


Input 
 	
Output 
 
3
****
It
Shakes*e
S*speare
Shakes*e
*peare

Case #1: TRUE
Case #2: TRUE
Case #3: FALSE


In sample case #1, the title It matches both patterns. Note that it is possible for a * to match zero characters.

In sample case #2, the title Shakespeare matches both patterns.

In sample case #3, there is no title that matches both patterns. Shakespeare, for example, does not work because the * at the start of the *peare pattern cannot match six letters.
 * @author rimondal
 *
 */

public class PatternsOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rmp;
		int T;
		T = sc.nextInt();
		String result[] = new String[T];
		for(int i=0;i<T;i++){
			
			String pattern1 = sc.next();
			String pattern2 = sc.next();
			for(int pattern1Index=0,pattern2Index=0;pattern1Index<pattern1.length() && pattern2Index<pattern2.length();pattern1Index++,pattern2Index++){
				if('*'==pattern1.charAt(pattern1Index)){
					pattern2Index = pattern2Index + 4;
					if(pattern2.length()<=pattern2Index){
						result[i] = "TRUE";
						break;
					}
				}
				else if('*'==pattern2.charAt(pattern2Index)){
					pattern1Index = pattern1Index+4;
					if(pattern1.length()<=pattern1Index){
						result[i] = "TRUE";
						break;
					}
				}
				else if(pattern1.charAt(pattern1Index)==pattern2.charAt(pattern2Index)){
					result[i] = "TRUE";
				}
				else{
					result[i] = "FALSE";
					break;
				}
				
			}
			
		}
		
		for(int i=0;i<T;i++){
			System.out.println("Case #"+(i+1)+": "+result[i]);
		}
		
	}

}
