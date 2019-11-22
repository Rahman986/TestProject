package com.haseeb;

public class SysnchronizedDemo {
	public static void main(String[] args) {
		Display d=new Display();
		Display d1=new Display();
		MyThread t=new MyThread(d,"Haseeb");
		MyThread t1=new MyThread(d1,"Rahman");
		t.start();
		t1.start();
	}

}
class Display{
	 public void wish(String name) {
		//synchronized(this) {
			for(int i=0;i<10;i++) {
				System.out.println("Good Morning");
			}
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ex) {
				System.out.println(name);
			}
		//}
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d=d;
		this.name=name;
		
	}
	public void run() {
		 d.wish(name);
	}
}