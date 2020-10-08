package com.capgemini;

import org.junit.Test;
import org.junit.Assert;
import com.capgemini.*;

public class Testing {
	@Test
	public void testFindMax() {
		
		MaximumTest<Integer> i = new MaximumTest<Integer>();
		i.MaxOfAll(1,2,3,4,5);
		Assert.assertEquals(5, (int)i.maximum());
		
		MaximumTest<Float> f = new MaximumTest<Float>();
		f.MaxOfAll(1.2f,2.2f,3.3f,4.4f);
		Assert.assertEquals(new Float (4.4), f.maximum());
		
		MaximumTest<String> s = new MaximumTest<String>();
		s.MaxOfAll("peach","apple","banana","book");
		Assert.assertEquals("peach", s.maximum());
	}
	

}
