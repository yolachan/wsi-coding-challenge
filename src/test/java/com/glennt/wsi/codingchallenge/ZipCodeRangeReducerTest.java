package com.glennt.wsi.codingchallenge;

import org.junit.Assert;
import org.junit.Test;

import com.glennt.wsi.codingchallenge.model.ZipCodeRange;

/**
 * Various test cases for the RangeReducer class.
 * 
 * @author Glenn Tolentino
 *
 */
public class ZipCodeRangeReducerTest {
	
	/**
	 * Test case 1:
	 * 
	 * No overlapping ranges
	 * 
	 * Input: [94133,94133] [94200,94299] [94600,94699]
	 * Expected: [94133,94133] [94200,94299] [94600,94699]
	 */
	@Test
	public void case1() {
		ZipCodeRangeReducer reducer = new ZipCodeRangeReducer();
		
		ZipCodeRange[] newRanges = reducer.reduceZipCodeRanges(new String[]{
			"[94133,94133]", "[94200,94299]", "[94600,94699]"
		});
		Assert.assertEquals("[94133,94133] [94200,94299] [94600,94699]", ZipCodeRange.toString(newRanges));
	}
	
	/**
	 * Test case 2:
	 * 
	 * One overlapping range
	 * 
	 * Input: [94133,94133] [94200,94299] [94226,94399] 
	 * Expected: [94133,94133] [94200,94399]
	 */
	@Test
	public void case2() {
		ZipCodeRangeReducer reducer = new ZipCodeRangeReducer();
		
		ZipCodeRange[] newRanges = reducer.reduceZipCodeRanges(new String[]{
			"[94133,94133]", "[94200,94299]", "[94226,94399]" 
		});
		Assert.assertEquals("[94133,94133] [94200,94399]", ZipCodeRange.toString(newRanges));
	}
	
	/**
	 * Test case 3:
	 * 
	 * All the same ranges
	 * 
	 * Input: [11111,11111] [11111,11111] [11111,1111] 
	 * Expected: [11111,11111]
	 */
	@Test
	public void case3() {
		ZipCodeRangeReducer reducer = new ZipCodeRangeReducer();
		
		ZipCodeRange[] newRanges = reducer.reduceZipCodeRanges(new String[]{
			"[11111,11111]", "[11111,11111]", "[11111,11111]" 
		});
		Assert.assertEquals("[11111,11111]", ZipCodeRange.toString(newRanges));
	}
	
	/**
	 * Test case 4:
	 * 
	 * All ranges get swallowed up by one range
	 * 
	 * Input: [11111,11111] [11112,11113] [11111,11111] [11117,11118] [11110,11119] [10000,20000] 
	 * Expected: [10000,20000]
	 */
	@Test
	public void case4() {
		ZipCodeRangeReducer reducer = new ZipCodeRangeReducer();
		
		ZipCodeRange[] newRanges = reducer.reduceZipCodeRanges(new String[]{
			"[11111,11111]", "[11112,11113]", "[11111,11111]", "[11117,11118]", "[11110,11119]", "[10000,20000]" 
		});
		Assert.assertEquals("[10000,20000]", ZipCodeRange.toString(newRanges));
	}
	
	/**
	 * Test case 5:
	 * 
	 * Specify some ranges backwards 
	 * 
	 * Input: [31111,11111] [11111,31111] [11110,11111] [11117,10000] [11110,11119] [32110,33112] 
	 * Expected: [11111,31111] [32110,33112]
	 */
	@Test
	public void case5() {
		ZipCodeRangeReducer reducer = new ZipCodeRangeReducer();
		
		ZipCodeRange[] newRanges = reducer.reduceZipCodeRanges(new String[]{
			"[31111,11111]", "[11111,31111]", "[11110,11111]", "[11117,10000]", "[11110,11119]", "[32110,33112]" 
		});
		Assert.assertEquals("[10000,31111] [32110,33112]", ZipCodeRange.toString(newRanges));
	}

}
