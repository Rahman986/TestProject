package com.collection.durgasoft;

public class TrickyQuestion {
	public static void javaHungy(Exception ex) {
		System.out.println("Exception");
	}
   public static void javaHungy(ArithmeticException ex) {
	   System.out.println("Arithmatic exception");
   }
   public static void javaHungy(Object o) {
	   System.out.println("Object");
   }
   public void m1(String s1) {
	   s1="hello java";
   }




   public static void main(String[] args) {
   String s1="abc";
   String s2=s1;
   s1+="d";
   System.out.println(s1+"\t"+s2+"\t"+(s1==s2)+s1.equals(s2));
 
   StringBuffer sb1=new StringBuffer("abc");
   StringBuffer sb2=sb1;
   sb1.append("b");
   System.out.println(sb1+"\t"+sb2+"\t"+(sb1==sb2)+sb1.equals(sb2));


	

	   




}
}
