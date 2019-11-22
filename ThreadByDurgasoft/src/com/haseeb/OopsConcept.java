package com.haseeb;

import java.util.HashSet;
import java.util.Set;

public class OopsConcept {
	public static void main(String[] args) {
P p=new C();
Set <String>set=new HashSet<String>();
set.add(new String("a"));
set.add(new String("b"));
set.add(new String("c"));
for(String a:set) 
	a.value="a";

  


		
	}

}

abstract class P{
   public void m1() {
	   System.out.println("");
   }

}
class  C extends P{
	
}