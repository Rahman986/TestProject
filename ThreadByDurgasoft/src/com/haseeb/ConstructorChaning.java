package com.haseeb;

public class ConstructorChaning {
	public static void main(String[] args) {
		A a=new A();
		
	}

}
 class A{
	 A(){
		 this(10);
		 System.out.println("Default Constructor");
	 }
	 A(int i){
		 this(10.6f,70);
		 System.out.println("One Parameter Constructor");
	 }
	 A(float d,int y){
		 this(10);
		 System.out.println("two argument constrctor");
	 }
 }
