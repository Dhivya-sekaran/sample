package com.testing.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class sampleutiltest {
	@Test
	public void testSum() {
	       Integer x = 15;
	       Integer y = 15;
	       Integer expResult = 30;
	       Integer result =sampleutiltest.sum(x,y);
	       assertEquals(expResult, result);
	       assertEquals(null, sampleutiltest.sum(15, null));
	       assertEquals(null, sampleutiltest.sum(15, 15));
	       assertEquals(null, sampleutiltest.sum(null, null));
	   }

	private static Integer sum(Integer x, Integer y) {
		// TODO Auto-generated method stub
		return null;
	}
}