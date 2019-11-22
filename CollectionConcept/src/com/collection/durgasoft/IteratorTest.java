package com.collection.durgasoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(16);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.next());
		}
		A a=new B();
		a.m1();
		System.out.println(a.a);
		
	}

}

class A{
	int a=20;
	public void m1() {
		
		System.out.println("A");
	}
}
class B extends A{
	int a=40;
	public void m1() {
		System.out.println("B");
	}
}