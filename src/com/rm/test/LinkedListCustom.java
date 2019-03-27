package com.rm.test;

import java.util.Scanner;

public class LinkedListCustom<T> {
	private Node<T> header;
	private Node<T> tail;
	
	
	@Override
	public String toString() {
		return "LinkedListCustom [" + header + "]";
	}

	public void add(T elem){
		Node<T> nd = new Node<T>();
		nd.setValue(elem);
		if(header==null){
			header = nd;
			tail = nd;
		}
		else{
			tail.setNextRef(nd);
			tail = nd;
		}
		
	}
	
	public void delete(Node<T> src,Node<T> dest){
		src.setNextRef(dest);
	}
	
	
	
	
	static int poisonousPlants(int[] p) {
        // Complete this function
		LinkedListCustom<Integer> list = new LinkedListCustom<Integer>();
        for(int i:p){
        	list.add(i);
        }
        
        int count =0;
        
        while(true){
        	boolean flag =true;	
        	Node<Integer> temp =list.header;
        	int tempValue = -1;
        	while(temp.getNextRef()!=null){       	
        		if((tempValue>-1 && temp.getNextRef().getValue()>tempValue) || temp.getNextRef().getValue()>temp.getValue()){
        			temp.setNextRef(temp.getNextRef().getNextRef());
        			tempValue = temp.getNextRef().getValue();
        			temp = temp.getNextRef();
        			flag = false;
        		}
        		else{
        			tempValue = -1;
        			temp = temp.getNextRef();
        		}
        	}
        	if(flag)
        		break;
        	count++;
       }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }

}

class Node<T> implements Comparable<T>{
	private T value;
	private Node<T> nextRef;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		if(o== this.value)
			return 0;
		return 1;
	}
	@Override
	public String toString() {
		return "Node [value=" + value + ", nextRef=" + nextRef + "]";
	}
	
	
}
