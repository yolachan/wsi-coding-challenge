package com.glennt.wsi.codingchallenge.utils;

/**
 * Utility functions for strings.
 * 
 * @author Glenn Tolentino
 *
 */
public class StringUtils {

	/**
	 * Utility function for flattening an array of strings with a specified delimiter.
	 * @param arr The array of strings
	 * @param delimiter The delimiter that will be placed between the flattened strings
	 * @return A flattened string of array items separated by the specified delimiter
	 */
	public static String join(String[] arr, String delimiter) {
		StringBuffer buf = new StringBuffer();
		
		boolean first = false;
		for(String item : arr) {
			if(first == false) {
				buf.append(item);
				first = true;
			} else {
				buf.append(" " + item);
			}
		}
		return buf.toString();
	}
	
}
