package com.rm.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	List<Integer> lt = new ArrayList<Integer>();
    	List<Integer> lt2 = new ArrayList<Integer>();
    	lt.add(1);
    	lt.add(2);
    	lt2.add(2);
    	lt2.add(1);
    	Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    	map.put(1, 1);
    	map.put(2, 2);
    	System.out.println(lt.equals(lt2));
    	System.out.println(replaceSpaceWithUnderscore(" "));
        if("ABC".trim() == "ABc".trim()){
        	System.out.println("ABC");
        }
        Integer i1 =2;
        Integer i2 =2;
        StringBuffer s1 = new StringBuffer("ABC");
        StringBuffer s2 = new StringBuffer("ABC");
        if(s1.equals(s2)){
        	System.out.println("ABC");
        }
    }
    public static String replaceSpaceWithUnderscore(String st){
    	if(st!=null &&  !st.isEmpty()){
            if(st.trim().isEmpty()){
            	return "";
            }
            return st.trim().replaceAll("\\s+", " ").replaceAll(" ","_").toUpperCase();
            
        }
        return "";
    }
   
}