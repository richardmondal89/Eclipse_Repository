package com.rm.hackerRank.dataStructure.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	static char leftParan [] ={'(','[','{'};
	static char rightParan [] ={')',']','}'};
    static String isBalanced(String sh) {
        // Complete this function
       
        Stack<Character> stack = new Stack<Character>();
        
        for(char s:sh.toCharArray()){
            if(getIndex(leftParan,s)>=0){
                stack.push(s);
            }
            else if(getIndex(rightParan,s)>=0){
                if(!(!stack.empty() && getIndex(rightParan,s)==getIndex(leftParan,stack.pop()))){
                    return "NO";
                }
            }
        }
        
        return "YES";
        
    }
    private  static int getIndex(char [] arr,char c){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
