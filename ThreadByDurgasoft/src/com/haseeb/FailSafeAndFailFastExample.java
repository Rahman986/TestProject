package com.haseeb;

import java.util.LinkedHashSet;
import java.util.Set;

public class FailSafeAndFailFastExample {
	public static void main(String[] args) {
		Set set=new LinkedHashSet();
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		System.out.println(set);
	}

}
class Student{
	int id;
	Student(int id){
		this.id=id;
	}
	public String toString() {
		return ""+id;
	}
	/*public int hashCode() {
		return id;
	}*/
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st=(Student)obj;
			return this.id==st.id;
		}
		return true;
	}
}