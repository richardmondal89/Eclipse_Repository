package com.rm.hackerEarth;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class ORSum {
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
    	
    	int T;
    	Scanner sc =new Scanner(System.in);
    	T = sc.nextInt();
    	for(int i=0;i<T;i++){
    		int N = sc.nextInt();
    		int arr[] = new int[N];
    		for(int j=0;j<N;j++){
    			arr[j] =sc.nextInt(); 
    		}
    		int Sum=0;
    		
    		for (int i1 = 0; i1 < (1<<N); i1++)
            {	int next =0;
    			for (int j = 0; j < N; j++){
    				if ((i1 & (1 << j)) > 0){
    						next = next | arr[j];
    						System.out.print(arr[j]);
    				}
    			}
    			Sum =Sum+next;
    			System.out.println();
            }
    	//	System.out.println(Sum);
    	}
    	
        
	}
        

    }
