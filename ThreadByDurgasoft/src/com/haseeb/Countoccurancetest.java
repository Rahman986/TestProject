package com.haseeb;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;

public class Countoccurancetest {
	public static void main(String[] args) {
		
		String str="wffwfw,wwrtwrt,wewtwt,wqwtwt";
		String str1[]=str.split(",");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.println(""+str1[i]);
		}
		
		int num=121;
		int sum=0,number,rem;
		number=num;
		while(num!=0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num /=10;
			
		}
		if(number==sum) {
			System.out.println("Y\t"+number);
		}else {
			System.out.println("N\t"+number);
		}
		/*String str="abba";
		String rev="";
		int sum=0,i=0;
		while(i<str.length()) {
			rev=str.charAt(i)+rev;
			i++;
			
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("String is Polindram\t"+str);
		}else {
			System.out.println("String is not\t"+str);
		}*/
		 /* Map<Character,Integer>map=new HashMap<Character,Integer>();
		  char[]ch=str.toCharArray();
		  for(char c:ch) {
			  if(!map.containsKey(c)) {
				  map.put(c,1);
			  }else {
				  int cnt=map.get(c);
				  map.put(c, cnt+1);
			  }
		  }
		  System.out.println(map);*/
		
	}

}
