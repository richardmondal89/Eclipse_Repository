package com.rm.hackerRank.first;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MainClass {
	
	
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode returnListNode = new ListNode(0) ;
	ListNode temp1 = l1,temp2 = l2,temp3 = returnListNode;
	int i1,i2,c = 0;
	while(temp1 !=null || temp2 !=null){
		i1=i2=0;
		if(temp1!=null){
			i1 = temp1.val;
			temp1 = temp1.next;
		}
		if(temp2!=null){
			i2 = temp2.val;
			temp2 = temp2.next;
		}
			i1 = i1+i2+c;
			if(i1>10){
				c =i1/10;
				i1 = i1%10;
			}
			else{
				c =0;
			}
			temp3.val =i1;	
			if(temp1 !=null || temp2 !=null){
			temp3.next =  new ListNode(0);
			temp3 = temp3.next;
			}
	}
	
	return returnListNode;
  }
}



  class ListNode {
     int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
  
  public class Test {
	    public static int[] stringToIntegerArray(String input) {
	        input = input.trim();
	        input = input.substring(1, input.length() - 1);
	        if (input.length() == 0) {
	          return new int[0];
	        }
	    
	        String[] parts = input.split(",");
	        int[] output = new int[parts.length];
	        for(int index = 0; index < parts.length; index++) {
	            String part = parts[index].trim();
	            output[index] = Integer.parseInt(part);
	        }
	        return output;
	    }
	    
	    public static ListNode stringToListNode(String input) {
	        // Generate array from the input
	        int[] nodeValues = stringToIntegerArray(input);
	    
	        // Now convert that list into linked list
	        ListNode dummyRoot = new ListNode(0);
	        ListNode ptr = dummyRoot;
	        for(int item : nodeValues) {
	            ptr.next = new ListNode(item);
	            ptr = ptr.next;
	        }
	        return dummyRoot.next;
	    }
	    
	    public static String listNodeToString(ListNode node) {
	        if (node == null) {
	            return "[]";
	        }
	    
	        String result = "";
	        while (node != null) {
	            result += Integer.toString(node.val) + ", ";
	            node = node.next;
	        }
	        return "[" + result.substring(0, result.length() - 2) + "]";
	    }
	    
	    public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String line;
	        while ((line = in.readLine()) != null) {
	            ListNode l1 = stringToListNode(line);
	            line = in.readLine();
	            ListNode l2 = stringToListNode(line);
	            
	            ListNode ret = new MainClass().addTwoNumbers(l1, l2);
	            
	            String out = listNodeToString(ret);
	            
	            System.out.print(out);
	        }
	    }
	}
 