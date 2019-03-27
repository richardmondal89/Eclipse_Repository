package com.rm.hackerRank.dataStructure.arrays;

import java.util.Scanner;

public class LeftRotation {
	static int[] leftRotation(int[] a, int d) {
        // Complete this function
        if(d>=a.length){
            d = a.length/d;
        }
        int b[] =new int[a.length];
        for(int i=0;i<a.length;i++){
            if((i+d)>=a.length){
            	b[i]=a[Math.abs(a.length - (i+d))]  ;
            }
            else{
                b[i] = a[i+d];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
