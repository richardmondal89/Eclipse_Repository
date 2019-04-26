package com.rm.test;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test2 {
	
	// function check 
	// whether a number 
	// is prime or not 
	static boolean isPrime(int n) 
	{ 
	    // Corner cases 
	    if (n <= 1) 
	        return false; 
	    if (n <= 3) 
	        return true; 
	  
	    // This is checked so  
	    // that we can skip 
	    // middle five numbers 
	    // in below loop 
	    if (n % 2 == 0 ||  
	        n % 3 == 0) 
	        return false; 
	  
	    for (int i = 5; 
	             i * i <= n; i = i + 6) 
	        if (n % i == 0 || 
	            n % (i + 2) == 0) 
	            return false; 
	  
	    return true; 
	} 
	  
	// Function to print primes 
	static void printPrime(int n) 
	{ 	
		char c ='A';
		System.out.println(isPrime(217));
	   /* for (int i = 3; i <= n; i++) 
	    { 
	    	
	        if (isPrime(i)) 
	            System.out.print(c++  + " =  " + i +" "); 
	    } */
	} 
	
	public static void main (String[] args) 
	{ 	
		print();
	}
	  
	// Driver Code 
	public static void print1() 
	{ 	
		/*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		GregorianCalendar iCal = new GregorianCalendar();
		iCal.setTime(date);
		GregorianCalendar normalizedToEndOfDay = new GregorianCalendar();
		normalizedToEndOfDay.setTime(date);
		normalizedToEndOfDay.set(GregorianCalendar.MILLISECOND, 0);
		normalizedToEndOfDay.set(GregorianCalendar.SECOND, 0);
		normalizedToEndOfDay.set(GregorianCalendar.MINUTE, 0);
		normalizedToEndOfDay.set(GregorianCalendar.HOUR_OF_DAY, 0);
		normalizedToEndOfDay.set(GregorianCalendar.DAY_OF_MONTH,  iCal.get(GregorianCalendar.DAY_OF_MONTH));
		normalizedToEndOfDay.set(GregorianCalendar.MONTH,  iCal.get(GregorianCalendar.MONTH));
		normalizedToEndOfDay.set(GregorianCalendar.YEAR,  iCal.get(GregorianCalendar.YEAR));

		long millis = date.getTime() - normalizedToEndOfDay.getTimeInMillis();
		String st = String.format("%02d:%02d:%02d", 
				TimeUnit.MILLISECONDS.toHours(millis),
				TimeUnit.MILLISECONDS.toMinutes(millis) -  
				TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)), // The change is in this line
				TimeUnit.MILLISECONDS.toSeconds(millis) - 
				TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));   
		System.out.println(st);*/
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		double hours =date.getHours();
		double min = date.getMinutes()*60*1000;
		double second = date.getSeconds()*1000;
		
		double totalmil = min + second;
		System.out.println("totalmil " + " : "+totalmil);
		double minIn100Base = (double) ((totalmil*10.0)/6.0);
		System.out.println("minIn100Base" + " : "+minIn100Base);
		while(minIn100Base>1){
			minIn100Base = minIn100Base /10;
		}
		System.out.println(hours+minIn100Base);
		BigDecimal big = new BigDecimal(hours +  minIn100Base);
		System.out.println(big);
		double retrive = big.doubleValue();
		System.out.println("retrive" + " : "+retrive);
		String st = Double.toString(retrive);
		int index = st.indexOf('.');
		String hour = st.substring(0, index);
		System.out.println("hour" + " : "+hour);
		String minRemain = st.substring(index+1);
		System.out.println("minRemain" + " : "+minRemain);
		long i = Long.parseLong(minRemain);
		 double totalMin = i/60.0;
		
		System.out.println(totalMin);
		
	} 
	
	
	private static void print(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		double hours =date.getHours();
		double min = date.getMinutes() +date.getSeconds()/60.0;
		double minIn100Base = (double) ((min*10.0)/6.0);
		while(minIn100Base>1){
			minIn100Base = minIn100Base /10;
		}	
		BigDecimal big = new BigDecimal(hours +  minIn100Base);
		System.out.println("big"+ "  : "+big);
		String str = big.toString();
		int index = str.indexOf(".");
		String hour = str.substring(0, index);		
		System.out.println("hour" + " : "+ hour);
		str = str.substring(index+1,index+3)+"."+str.substring(index+3);
		double retrive = (Double.parseDouble(str) * (0.6));
		int mins =(int) retrive;
		double seconds = (retrive - mins)*(0.6);
		String secondStr = String.format("%.2f", seconds);		
		System.out.println("mins" + " : " +mins);
		index = secondStr.indexOf(".");
		secondStr = secondStr.substring(index+1);
		System.out.println("Second" + " : " +secondStr);
		
	}
}

