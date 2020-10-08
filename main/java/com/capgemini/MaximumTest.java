package com.capgemini;

import java.lang.*;
import java.lang.Float;

public class MaximumTest {
	Float x,y,z;

	public MaximumTest(Float x, Float y, Float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static Float toFindMax(Float x, Float y, Float z)  {
		Float max =x;
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
		Float x = (float) 1.1;
		Float y = (float) 2.1;
		Float z = (float) 3.1;
		toFindMax(x,y,z);
	}
		
}
