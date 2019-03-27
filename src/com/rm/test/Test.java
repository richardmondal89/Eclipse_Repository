package com.rm.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

 enum Currency {
    PENNY("1"), NICKLE("5:"), DIME("10"), QUARTER("25:");
    private String value;

    private Currency(String value) {
            this.value = value;
    }
    
    public String getValue(Currency cur){
    	return cur.value;
    }
}

public class Test implements Comparator<String> {

	public static void main(String[] args) {

		Date curDate = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

		String DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd-MMM-yyyy");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr +"afa");

		try {
			Date strToDate = format.parse(DateToStr);
			System.out.println(strToDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	private static void change(Timestamp time1, Timestamp time2){
		
		time1 = time2;
	}
	
	private static void change(Integer i){
		i = new Integer(7);
	}
	
	
	public void check(){
		String a[]=null;
		Arrays.sort(a,this);
	}

	public static void processPersonsWithFunction(java.util.List<Person> roster, Predicate<Person> tester,
			Function<Person, String> mapper, Consumer<String> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				String data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	public static <T> T genericTest(){
		T t = null;
		System.out.println("In generic method");
		return t;
		
        
        
	}
}

class Person {

}