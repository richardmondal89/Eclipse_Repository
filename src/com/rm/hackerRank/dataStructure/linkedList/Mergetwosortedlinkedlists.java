package com.rm.hackerRank.dataStructure.linkedList;

import java.util.Random;

public class Mergetwosortedlinkedlists {
	
	private static Node mergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method
	    if(headA==null)
	        return headB;
	    if(headB==null){
	        return headA;
	    }
	    Node head;
	    Node head2;
	    if(headA.data<headB.data){
	        head = headA;   
	        head2 = headB;
	    }
	    else{
	        head = headB;
	        head2 = headA;
	    }
	    Node temp = head;
	    Node back = head;
	    Node flag=null;
	    while(temp!=null){
	        if(temp.data<=head2.data){
	        	back = temp;
	        	if(temp.next==null){
	            	flag = temp;
	            }
	            temp = temp.next;
	            
	        }
	        else{
	            back.next = head2;
	            head2 = head2.next;
	            back.next.next = temp;
	            back = back.next;
	        }
	    }
	    flag.next = head2;
	    return head;
	}
	private static void print(Node nd){
		Node temp =nd;
		while(temp!=null){
			System.out.print(temp.data + " : ");
			temp =temp.next;
		}
	}
	public static void main(String as[]) {
		LinkedList nd1 = new LinkedList();
		LinkedList nd2 = new LinkedList();
		Random rm =new Random(100);
		int data = 0;
		for (int i = 0; i < 3; i++) {
			data = rm.nextInt(100);
		//	System.out.println(data);
			nd1.add(i);
		}
		System.out.println();
		for (int i = 1; i < 4; i++) {
			data = rm.nextInt(100);
	//		System.out.println(data);
			nd2.add(i);
		}
		Node nd = mergeLists(nd1.head,nd2.head);
		print(nd);
		System.out.println();
	}

}

