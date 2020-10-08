package com.capgemini;

import java.lang.*;


public class MaximumTest<T extends Comparable<T>> {
	T x,y,z;
	
	public MaximumTest(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public T maximum() {
		return MaximumTest.maximum(x,y,z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max =x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		System.out.println("The max number is "+max);
		return max;	
		
	}

	public static void main(String[] args) {
		Integer x = 10;
		Integer y = 20;
		Integer z = 30;
		maximum(x,y,z);
		Float i = (float) 1.1;
		Float j = (float) 2.1;
		Float k = (float) 3.1;
		String a ="Apple";
		String b="banana";
		String c ="peach";
		maximum(i,j,k);
		maximum(a,b,c);
	}
		
}
