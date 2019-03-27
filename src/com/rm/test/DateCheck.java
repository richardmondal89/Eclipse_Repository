package com.rm.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateCheck {

	public static void main(String ...as) throws ParseException{
		String d1= "2014-01-13 00:00:00.0";
		String d2 = "2014-01-19 17:00:00.0";
		Date date1,date2;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long diff = format.parse(d2).getTime() - format.parse(d1).getTime();
		System.out.println(diff);
		System.out.println((diff)/(24*60*60*1000));
		/*************************************************************/
		date1 = format.parse(d1);
		date2 = format.parse(d2);
		System.out.println(date2.getTime()-date1.getTime());
		System.out.println(TimeUnit.MICROSECONDS.toDays(date2.getTime()-date1.getTime()));
		System.out.println(new DateCheck().dateDifference(date1, date2));
	}
	
	
	private  long dateDifference(Date startDate,Date endDate) throws ParseException{
		
		return (long)(endDate.getTime() - startDate.getTime())/(24*60*60*1000);
		
		
	}
}
