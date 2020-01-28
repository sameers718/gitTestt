package com.cjc;

import java.util.Arrays;

public class ArrayReverse {

	static final public synchronized strictfp void main(String... sameer) {
		
		int[] a= {10,20,50,30,40};
		int temp=0;
		
		for(int i=0; i<a.length/2; i++)
		{
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}