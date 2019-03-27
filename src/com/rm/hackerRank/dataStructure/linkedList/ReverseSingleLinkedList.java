package com.rm.hackerRank.dataStructure.linkedList;

class LinkedList {
	Node head;

	public void add(int i) {
		Node addNode = new Node();
		addNode.data = i;
		if (head == null) {
			head = addNode;
		} else {
			Node t = head;
			while (t.next != null) {
				t = t.next;
			}
			t.next = addNode;

		}
	}

	public Node getHead() {
		return head;
	}
	
	public void print(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
}


public class ReverseSingleLinkedList {
	public static Node reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node remaining = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return remaining;
	}

	public static void main(String as[]) {
		LinkedList nd = new LinkedList();
		for (int i = 0; i < 5; i++) {

			nd.add(i);
		}
		Node tail = reverse(nd.getHead());
		while(tail!=null){
			System.out.print(tail.data);
			tail = tail.next;
		}
		System.out.println();

	}
}

class Node {
	Node next;
	int data;
	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + "]";
	}
	
}