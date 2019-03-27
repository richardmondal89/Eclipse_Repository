package com.rm.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class CollectionSort {

	public static void main(String as[]) {
		String [] list = {"9","64","96"};
		List<String> lt = (List<String>) Arrays.asList(list);
		Collections.sort(lt,new Comparator<String>() {
			@Override
			public int compare(String obj1, String obj2) {
			    return  (obj2+obj1).compareTo(obj1+obj2);
			}
		});
		
		for(String s: lt){
			System.out.print(s + " ");
		}
		
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		try {
			Date d = ft.parse("2018-08-11");
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
