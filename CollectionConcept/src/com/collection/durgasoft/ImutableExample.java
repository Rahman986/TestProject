package com.collection.durgasoft;

import java.util.Comparator;
import java.util.Iterator;



public class ImutableExample {
public static void main(String[] args) {
	XX.m1();
	Y y=new Y();
	y.m1();
	Y.m1();
	
}

}
interface X{
	static void m1() {
		System.out.println("Interface");
	}
	
}
class Y implements XX{
	
}