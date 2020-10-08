package com.capgemini;

import java.lang.*;
import java.util.Arrays;
import java.lang.Integer;



public class MaximumTest<T extends Comparable<T>> {
	T max;
	
	public T maximum() {
		return this.max;
	}

	public MaximumTest() {
		
	}


	public T MaxOfAll(T... values) {
		Arrays.sort(values);
		this.max = values[values.length - 1];
		printMax(max);
		return max;
	}
	
	public static <T> void printMax(T max) {
		System.out.println("Max is : " + max);
	}

	public static void main(String[] args) {
		
		MaximumTest<Integer> i = new MaximumTest<Integer>();
		i.MaxOfAll(1,2,3,4,5);
		
		MaximumTest<Float> f = new MaximumTest<Float>();
		f.MaxOfAll(1.2f,2.2f,3.3f,4.4f);
		MaximumTest<String> s=new MaximumTest<String>();
		s.MaxOfAll("peach","apple","banana","book");
		
		
	}
		
}
