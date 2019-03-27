package com.rm.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lt = new ArrayList<String>();
		ListIterator<String> listIt ;
		listIt = lt.listIterator();
		lt.add("werwer");
		lt.add("werwer2");
		lt.add("werwer3");
		lt.add("werwer4");
		
		for(String l : listIt){
			
		}
	}

}
