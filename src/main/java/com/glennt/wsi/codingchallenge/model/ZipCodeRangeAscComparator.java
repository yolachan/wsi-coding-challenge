package com.glennt.wsi.codingchallenge.model;

import java.util.Comparator;

/**
 * Comparator class that allows the sorting of a collection of Range objects first by lowerBound, then by upperBound.
 * 
 * @author Glenn Tolentino
 *
 */
public class ZipCodeRangeAscComparator implements Comparator<ZipCodeRange>{
	
	/**
	 * Compares two ranges based on their lowerBound and upperBound values.
	 * 
	 * @param range1 The first zip code range to compare
	 * @param range2 The second zip code range to compare
	 * @return An integer that indicates if range1 is greater, equal to, or less than range2 when sorted
	 */
	public int compare(ZipCodeRange range1, ZipCodeRange range2) {
		
		//first compare lower bounds to get ascending order
		int comp = range1.getLowerBound() - range2.getLowerBound();
		
		//if there is a tie for the lower bound, we want the upper bound to be in ascending order
		if(comp == 0) {
			comp = range1.getUpperBound() - range2.getUpperBound();
		}
		return comp;
	}
}
