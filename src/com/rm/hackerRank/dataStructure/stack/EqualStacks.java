package com.rm.hackerRank.dataStructure.stack;

import java.util.Scanner;

public class EqualStacks {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt(),i;
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        //store heights of the stacks in these variables
        int h1=0,h2=0,h3=0;
        //use these arrays to store the cylinder values 
        //and mimic a stack DS
        int[] a1 = new int[n1],a2 = new int[n2],a3 = new int[n3];
      
        for(i=0; i < n1; i++){
            int val = in.nextInt();
            a1[i]=val;
            h1+=val;
        }
 
        for(i=0; i < n2; i++){
            int val = in.nextInt();
            a2[i]=val;
            h2+=val;
        }
        
        for(i=0; i < n3; i++){
            int val = in.nextInt();
            a3[i]=val;
            h3+=val;
        }
        
        int top1=0,top2=0,top3=0;
        
        int val;
        while(h1!=h2 || h2!=h3){
            int h = Math.max(Math.max(h1,h2),h3);
            
            //popping the stack with the maximum total height
            if(h==h1){
                val = a1[top1++];
                h1-=val;
            } else if(h==h2){
                val = a2[top2++];
                h2-=val;
            } else if(h==h3){
                val = a3[top3++];
                h3-=val;
            }
        }
        
        System.out.println(h1);
    }
    
}
