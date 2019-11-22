package com.haseeb;

public class AgileTest {
	public static void main(String[] args) {
		String s="";
		for(int i=0;i<10;i++) {
			s=s+i;
			System.out.println(s);
		}
		System.out.println("Hello");
	}
	
	

}
abstract class A10{
	public void m1() {
		System.out.println("Hello");
	}
	abstract void m2();
}
class B10 extends A10{
	public void m2() {
		System.out.println("Hi");
	}
}