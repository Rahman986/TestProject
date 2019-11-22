package com.haseeb;

import java.util.HashMap;
import java.util.Map;

public class TestConstructor {
	
	public static void main(String[] args) {
		


		/*K k=new K();//parent
		System.out.println(k.x);
		k.m1(10);
		M m=new M();
		System.out.println(m.x);
		m.m1(10);//child
		K k1=new M();
		System.out.println(k1.x);
		k1.m1(10);//parent
		


	}

}

class K{
	int x=999;
	public synchronized  void m1(int i) throws Exception
{
		System.out.println("parent");
		
	}


}
class M extends K{
	int x=888;
	public native abstract void m1(int...i) 

	{
		System.out.println("child");
		*/
		
		String s="aabbcccAP";
		//s=s.toLowerCase();
		Map<Character,Integer>map=new HashMap<>();
		 char[]ch=s.toCharArray();
		   for(char c:ch) {
			   if(!map.containsKey(c)) {
				   map.put(c,1);
				   //int x=map.get(ch);
				   
			   }else {
				   int cnt=map.get(c);
				   map.put(c, cnt+1);
				
		   }
		
	}
		   System.out.println(map);
		   }
	
		
		TestConstructor testConstructor=new TestConstructor();
		//String s1="aaabbbcddr";
		//testConstructor.charcoutnt(s1,9);
		
	

	public static int charcoutnt(String s1,char c1) {
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==c1) {
				count++;
				
			}
			
		}
		return count++;
	}
}
