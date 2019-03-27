package com.rm.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		Date st1 = sdf.parse("04/05/2015");
		Date st2 = sdf.parse("04/01/2015");
		Date end1 = sdf.parse("04/06/2015");
		Date end2 = sdf.parse("04/05/2015");
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.compareTo(st1));
		if(st1.compareTo(st2)<0 ){
			if(st2.compareTo(end1)<=0)
				System.out.println("in between");
		}		
		else if(st1.compareTo(st2)>0){
			if(st1.compareTo(end2)<=0)
				System.out.println("in between");
		}
		else if(st1.compareTo(st2)==0){
			System.out.println("in between");
		}
		System.out.println("Not in between");
	}

}
