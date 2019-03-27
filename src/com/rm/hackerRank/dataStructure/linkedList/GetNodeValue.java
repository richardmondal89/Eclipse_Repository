package com.rm.hackerRank.dataStructure.linkedList;

import java.util.Random;

public class GetNodeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList nd = new LinkedList();
		Random rm = new Random();
		
		for(int i=0;i<10;i++){
			nd.add(rm.nextInt(100));
		}
		nd.print();
		int i = rm.nextInt(10);
		System.out.println(i+" : "+getNode(i, nd.getHead()));
	}
	
	private static int getNode(int i,Node head){
		Node temp = head;
		while(temp!=null){
			if(i>-1){
				i--;				
			}
			else{
				head = head.next;
			}
			temp = temp.next;
		}
		return head.data;
	}
}
