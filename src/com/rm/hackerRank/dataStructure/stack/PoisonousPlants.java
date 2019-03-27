package com.rm.hackerRank.dataStructure.stack;

import java.util.LinkedList;
import java.util.Scanner;

public class PoisonousPlants {

	static int poisonousPlants(int[] p) {
        // Complete this function
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i:p){
        	list.add(i);
        }
        int count = 0;
        while(true){
        	boolean flag =true;
        	Object[] a = list.toArray();
        	for(int i=1,ind=i;i<a.length;i++,ind++){
        		if((Integer)a[i]>(Integer)a[i-1]){
        			list.remove(ind--);
        			flag = false;
        		}
        	}
        	if(flag)
        		break;
        	count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }
}

