package com.rm.jobChalanges.goldManSachs;

import java.util.Scanner;

public class BankAccounts {
	
	static String feeOrUpfront(int n, float k, float x, float d, float[] p) {
        // Complete this function
        float toatal = 0;
        for(int p_i = 0; p_i < n; p_i++){
                toatal = toatal+ Math.max(k, (p[p_i]*x)/100);
        }
        if(toatal<=d){
        	return "fee";
        }
		return "upfront";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            float k = in.nextFloat();
            float x = in.nextFloat();
            float d = in.nextFloat();
            float[] p = new float[n];
            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextFloat();
            }
            String result = feeOrUpfront(n, k, x, d, p);
            System.out.println(result);
        }
        in.close();
    }

}
