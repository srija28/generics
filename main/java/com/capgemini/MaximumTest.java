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
	
	public static Integer toFindMaxInteger(Integer x, Integer y, Integer z)  {
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
	
	public static Float toFindMaxFloat(Float i, Float j, Float k)  {
		Float max =i;
		if(j.compareTo(max)>0) {
			max=j;
		}
		if(k.compareTo(max)>0) {
			max=k;
		}
		System.out.println("The max number is "+max);
		return max;	
	}
	
	public static String toFindMaximum(String a,String b,String c) {
		String max =a;
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		System.out.println("The max String is "+max);
		return max;	
		
	}
	public static void main(String[] args) {
		Integer x = 10;
		Integer y = 20;
		Integer z = 30;
		toFindMaxInteger(x,y,z);
		Float i = (float) 1.1;
		Float j = (float) 2.1;
		Float k = (float) 3.1;
		String a ="Apple";
		String b="banana";
		String c ="peach";
		toFindMaxFloat(i,j,k);
		toFindMaximum(a,b,c);
	}
		
}
