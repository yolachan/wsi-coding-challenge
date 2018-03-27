package com.glennt.wsi.codingchallenge.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for ZipCodeRange class.
 * 
 * @author Glenn Tolentino
 *
 */
public class ZipCodeRangeTest {
		
	/**
	 * Test zip code range equals method.
	 */
	@Test
	public void equals() {
		
		ZipCodeRange range = new ZipCodeRange(10000,20000);
		ZipCodeRange rangeEquals = new ZipCodeRange(10000,20000);
		ZipCodeRange rangeNotEquals = new ZipCodeRange(10001,20000);
		
		Assert.assertEquals(range, rangeEquals);
		Assert.assertNotEquals(range, rangeNotEquals);	
	}
}
