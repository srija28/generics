package com.capgemini;

import java.lang.*;
import java.lang.Integer;

public class MaximumTest {
	Integer x,y,z;

	public MaximumTest(Integer x, Integer y, Integer z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static Integer toFindMax(Integer x, Integer y, Integer z)  {
		Integer max =x;
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
		toFindMax(x,y,z);
	}
		
}
