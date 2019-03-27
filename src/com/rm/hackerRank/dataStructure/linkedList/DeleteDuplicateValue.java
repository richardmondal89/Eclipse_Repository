package com.rm.hackerRank.dataStructure.linkedList;

import java.util.HashMap;

public class DeleteDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static Node removeDuplicates(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method.
		HashMap<K, V> map;
		if(head==null){
			return head;
		}
		Node temp = head;
		
		while(temp.next!=null){
			if(temp.data == temp.next.data){
				temp.next = temp.next.next;
			}
			else{
				temp = temp.next;
			}
		}
		
		return head;
	}


}
