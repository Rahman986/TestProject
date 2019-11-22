package com.haseeb;

public class OverLoadingConcept {
	public void m1(Animal A) {
		System.out.println("Animal version");
	}
	public void m1(Monkey M) {
		System.out.println("Monkey version");
		
	}
	public static void main(String[] args) {
		OverLoadingConcept t=new OverLoadingConcept();
		Animal a=new Animal();//animal
		t.m1(a);
		Monkey m=new Monkey();//monkey
		t.m1(m);
		Animal a1=new Monkey();//animal
		t.m1(a1);
		//Monkey m1=new Animal();//comple time
	}

}
class Animal{
	
}
class Monkey extends Animal{
	
}