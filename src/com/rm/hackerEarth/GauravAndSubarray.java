package com.rm.hackerEarth;

import java.util.Scanner;

public class GauravAndSubarray {
	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        
		Scanner s = new Scanner(System.in);
		int N,Q;
		N = s.nextInt();
		Q=s.nextInt();
		int [] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = s.nextInt();
		}
		
    }
}
