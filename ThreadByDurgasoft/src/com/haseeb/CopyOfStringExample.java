package com.haseeb;

public class CopyOfStringExample {
	public static void main(String[] args) {
		
		String str="hello java";
		
		 
		char[]c=str.toCharArray();
		int size=c.length;
		char ch[]=new char[size];
		int i=0;
		while(i!=size) {
			// copy of string ch[i]=c[i];
			
			ch[size-1-i]=c[i];//reverse of string in java
			i++;
			}
		//System.out.println(c);
		System.out.println(ch);
	}

}
