package com.capgemini;

import org.junit.Test;
import org.junit.Assert;
import com.capgemini.*;

public class Testing {
	@Test
	public void testFindMax() {
		
		Assert.assertEquals(new Float(3.1), MaximumTest.toFindMax((float)1.1, (float)2.1, (float)3.1));
		
		
	}

}
