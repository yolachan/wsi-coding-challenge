package com.glennt.wsi.codingchallenge.utils;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Utility class for various validation routines.
 * 
 * @author Glenn Tolentino
 *
 */
public class ValidationUtils {

	//test for valid zip code pattern using regex
	private static final Pattern zipCodePattern = Pattern.compile("\\[\\d{5},\\d{5}\\]");
	
	/**
	 * Validates a zip code range string of the format [#####,#####].
	 * 
	 * @param string
	 * @return true of valid, false if not
	 */
	public static boolean isZipCodeRangeValid(String zipCodeRange) {
		
		boolean valid = true;
		
		if(zipCodeRange == null) {
			valid = false;
		} else {
			//check if regex matches, set valid to true if matches found
			Matcher matcher = zipCodePattern.matcher(zipCodeRange);
			valid = matcher.matches();
		}
		
		return valid;
	}

}
