package com.rm.scjp;

public class Scjp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b=new B();
		b.f();
	}

}

class A{
protected void f(){
System.out.println("A");
}}
class B extends A{
	@Override
protected void f(){
	System.out.println("B");
}
}