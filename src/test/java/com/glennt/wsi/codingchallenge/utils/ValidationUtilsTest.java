package com.glennt.wsi.codingchallenge.utils;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit tests for ValidationUtils class.
 * 
 * @author Glenn Tolentino
 *
 */
public class ValidationUtilsTest {

	/**
	 * Test various valid zip code strings.
	 */
	@Test
	public void validPatterns() {
		//valid
		Assert.assertEquals(true, ValidationUtils.isZipCodeRangeValid("[12424,32424]"));
		
		//valid
		Assert.assertEquals(true, ValidationUtils.isZipCodeRangeValid("[44444,55555]"));
	}
	
	/**
	 * Test various invalid zip code strings.
	 */
	@Test
	public void invalidPatterns() {
		//missing leading bracket
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid("44444,55555]"));
		
		//missing trailing bracket
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid("[44444,55555"));
		
		//no comma in between
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid("[44444455555]"));
		
		//missing upper bound
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid("[44444,]"));
		
		//missing lower bound
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid("[,44444]"));
		
		//only brackets
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid("[]"));
		
		//letters
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid("[444a4,44444]"));
		
		//special characters
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid("[$44a4,444#?]"));
		
		//null
		Assert.assertEquals(false, ValidationUtils.isZipCodeRangeValid(null));
	}
	
}
