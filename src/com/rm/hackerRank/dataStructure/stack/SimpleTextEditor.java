package com.rm.hackerRank.dataStructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        String S="";
        stack.push(S);
        int Q =sc.nextInt();
        int sw;
        for(int i=0;i<Q;i++){
            sw = sc.nextInt();
            switch(sw){
                    //append
                case 1:
                    String W = sc.next();
                    S = S+W;
                    stack.push(S);
                    break;
                case 2:
                    // delete last k char
                    int k = sc.nextInt();
                    if(S.length()-k>=0){
                    	S = S.substring(0, S.length()-k);
                    	stack.push(S);
                    }
                    break;
                case 3:
                    //print k
                    int kth = sc.nextInt();
                    System.out.println(S.charAt(kth-1));
                    break;
                case 4:
                    //undo
                	stack.pop();
                	S = stack.peek();
                    break;
            }
                
        }
    }

}
