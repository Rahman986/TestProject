package com.haseeb;

public class Thred1 {
public static void main(String[] args) {
	ThreadConcept t=new ThreadConcept();
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("main thread"+i);
	}
}
}
class ThreadConcept extends Thread{
	  public void run() {
		  for(int i=0;i<10;i++) {
			  Thread.yield();
			  System.out.println("child thread"+i);
		  }
	  }
}
