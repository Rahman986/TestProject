package com.collection.durgasoft;

public class XX {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		try {
			badMethod();
			System.out.println("A");
		}catch(Exception ex) {
			System.out.println("B");
			
		}finally {
			System.out.println("C");
			
		}
		System.out.println("D");
	}
	
 public static void badMethod() {
	 System.out.println("Rahman");
	 
 }
 
}
