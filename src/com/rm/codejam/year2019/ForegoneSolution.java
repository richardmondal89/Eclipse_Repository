package com.rm.codejam.year2019;

import java.util.Scanner;

public class ForegoneSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		String number;
		for(int i=0;i<T;i++){
			number = sc.next();
			printNumber(number,i);
		}
	}
	
	private static void printNumber(String number,int i){
		String A = number.toString(),B="0",temp=null;
		int aCcheck=0,bcheck=0,size =0;
		boolean flag1=true;
		do{
			flag1=true;
			if(A.compareTo(B)<0){
				 temp=A;
				 A=B;
				 B=A;
			}
			aCcheck = checkContainsDigit(A);
			size = A.length();
			if(aCcheck !=-1){
				if(aCcheck==0 && size>1){
					A = A.substring(1);
					A = addString(A, getRemainingForA(aCcheck,size));
					B = addString(B, getRemainingForB(aCcheck,size));
				}
				else if(size >1){
					A = A.substring(0, aCcheck) + "3" +A.substring(aCcheck+1);
					B = addString(B, getRemainingForB(aCcheck,size));
				}
				else if(size ==1){
					A =Long.toString(Long.parseLong(A) -1);
					B =  addString(B, "1");
				}
				flag1 = false;
			}
			aCcheck = checkContainsDigit(B);
			size = B.length();
			if(aCcheck !=-1){
				if(aCcheck==0 && size>1){
					B = B.substring(1);
					B = addString(B,getRemainingForA(aCcheck,size));
					A = addString(A, getRemainingForB(aCcheck,size));
				}
				else if(size >1){
					B = B.substring(0, aCcheck) + "3" +B.substring(aCcheck+1);
					A = addString(A, getRemainingForA(aCcheck,size));
				}
				else if(size ==1){
					B =Long.toString(Long.parseLong(B) -1);
					A =  addString(A, "1");
				}
				flag1 = false;
			}
		}while(!flag1);
		System.out.println("Case #"+(i+1)+": "+A +" "+B);
		
	}

	private static String getRemainingForB(int aCcheck, int size) {
		// TODO Auto-generated method stub
		String temp=null;
		for(int i1=aCcheck;i1<size;i1++){
			if(i1==aCcheck){
				temp ="1";
			}
			else{
				temp = temp+"0";
			}
		}
		return temp;
	}

	private static String getRemainingForA(int aCcheck, int size) {
		// TODO Auto-generated method stub
		String temp=null;
		for(int i1=aCcheck;i1<size;i1++){
			if(i1==aCcheck){
				temp ="3";
			}
			else{
				temp = temp+"0";
			}
		}
		return temp;
	}

	private static int checkContainsDigit(String a) {
		// TODO Auto-generated method stub
		return a.indexOf('4');
	}
	static String addString(String str1, String str2)  
	{  
	    // Before proceeding further, make sure length  
	    // of str2 is larger.  
	    if (str1.length() > str2.length()){  
	        String t = str1; 
	        str1 = str2; 
	        str2 = t; 
	    } 
	  
	    // Take an empty String for storing result  
	    String str = "";  
	  
	    // Calculate lenght of both String  
	    int n1 = str1.length(), n2 = str2.length();  
	  
	    // Reverse both of Strings 
	    str1=new StringBuilder(str1).reverse().toString(); 
	    str2=new StringBuilder(str2).reverse().toString(); 
	  
	    int carry = 0;  
	    for (int i = 0; i < n1; i++)  
	    {  
	        // Do school mathematics, compute sum of  
	        // current digits and carry  
	        int sum = ((int)(str1.charAt(i) - '0') +  
	                    (int)(str2.charAt(i) - '0') + carry);  
	        str += (char)(sum % 10 + '0');  
	  
	        // Calculate carry for next step  
	        carry = sum / 10;  
	    }  
	  
	    // Add remaining digits of larger number  
	    for (int i = n1; i < n2; i++)  
	    {  
	        int sum = ((int)(str2.charAt(i) - '0') + carry);  
	        str += (char)(sum % 10 + '0');  
	        carry = sum / 10;  
	    }  
	  
	    // Add remaining carry  
	    if (carry > 0)  
	        str += (char)(carry + '0');  
	  
	    // reverse resultant String 
	    str = new StringBuilder(str).reverse().toString(); 
	    int length1 =str.length();
	    for(int i1=0;i1<length1;i1++){
	    	if(str.charAt(i1) == '0' && length1>1 && i1==0){
	    		str = str.substring(1);
	    		i1=0;
	    		length1 = str.length();
	    	}
	    }
	    return str;  
	}

	
	/**
	 * private static void printNumber(long number,int i){
		long A = 0,B=0;
		boolean flag1=true;	
		if(number%2==0){
			long d= number/2;
			A=d;
			B=d;
		}
		else{
			long d=number/2;
			A=d+1;
			B=d;
		}
		do{
			flag1=true;
			if(checkContainsDigit(A)){
				if(A%2==0){
					long d= A/2;
					A=A-d;
					B=B+d;
				}
				else{
					long d=A/2;
					A=A-d+1;
					B=B+d;
				}
				flag1 = false;
			}
			
			if(checkContainsDigit(B)){
				if(B%2==0){
					long d= B/2;
					A=A+d;
					B=B-d;
				}
				else{
					long d=B/2;
					B=B-d+1;
					A=A+d;
				}
				flag1 = flag1&&false;
			}
		}while(!flag1);
		System.out.println("Case #"+(i+1)+": "+A +" "+B);
		
	}

	private static boolean checkContainsDigit(long a) {
		// TODO Auto-generated method stub
		if(a==0)
			return true;
		while(a!=0){
			if(a%10 ==4)
				return true;
			a=a/10;
		}
		return false;
	}
	 */
}
