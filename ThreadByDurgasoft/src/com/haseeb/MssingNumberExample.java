package com.haseeb;

import java.util.Arrays;

public class MssingNumberExample {
	public static void main(String[] args) {
		int[]array= {1,2,3,4,6};
		int missingNumber=getMissingNumber(array,6);
		System.out.printf("missing number is %s is %d %n",Arrays.toString(array),missingNumber);
	}

	private static int getMissingNumber(int[] array, int n) {
		int actualNum=0;
		int expactedNum=(n*(n+1)/2);
		
		for(int i:array) 
			actualNum=actualNum+i;
			
			
		return expactedNum-actualNum;
}
}