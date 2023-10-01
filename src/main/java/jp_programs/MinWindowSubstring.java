package jp_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinWindowSubstring {

	/**
	 * Min Window Substring Have the function MinWindowSubstring(strArr) take the
	 * array of strings stored in strArr, which will contain only two strings, the
	 * first parameter being the string N and the second parameter being a string K
	 * of some characters, and your goal is to determine the smallest substring of N
	 * that contains all the characters in K. For example: if strArr is
	 * ["aaabaaddae", "aed"] then the smallest substring of N that contains the
	 * characters a, e, and d is "dae" located at the end of the string. So for this
	 * example your program should return the string dae.
	 * 
	 * Another example: if strArr is ["aabdccdbcacd", "aad"] then the smallest
	 * substring of N that contains all of the characters in K is "aabd" which is
	 * located at the beginning of the string. Both parameters will be strings
	 * ranging in length from 1 to 50 characters and all of K's characters will
	 * exist somewhere in the string N. Both strings will only contains lowercase
	 * alphabetic characters.
	 * 
	 * Examples Input: new String[] {"ahffaksfajeeubsne", "jefaa"} Output: aksfaje
	 * Input: new String[] {"aaffhkksemckelloe", "fhea"} Output: affhkkse
	 * 
	 */

	public static String MinWindowSubstring(String[] strArr) {

		String nChars = strArr[0];
		String kChars = strArr[1];
		
		int leftPointer = 0;
		int rightPointer = 1;
		List<String> matchingWindows = new ArrayList<>();
		
		Map<Character, Integer> kMap = createMap(kChars);
		//System.out.println(kMap);
				
		while (true) {
			
			String window = nChars.substring(leftPointer, rightPointer);
			//System.out.println(window);
			
			Map<Character, Integer> nMap = createMap(window);
			
			boolean found = comparatorOfKElemsInN(nMap, kMap);
			
			if(found) {
				matchingWindows.add(window);
				leftPointer++;
				rightPointer=leftPointer;
			}
			
			if (rightPointer<nChars.length()) {
				rightPointer++;
			}
			
			if (rightPointer==nChars.length()) {
				leftPointer++;
			}
			
			if(leftPointer==nChars.length())
			break;
		}
		
		int length = Integer.MAX_VALUE;
		String output = "";
		for (String window : matchingWindows) {
			if(length > window.length()) {
				length = window.length();
				output = window;
			}
		}
		
		return output;
	}

	private static boolean comparatorOfKElemsInN(Map<Character, Integer> nMap, Map<Character, Integer> kMap) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character key : kMap.keySet()) {
			if(nMap.containsKey(key)) {
				map.put(key, nMap.get(key));
			}else {
				map.put(key, 0);
			}
		}
		
		for (Character key : kMap.keySet()) {
			if(map.get(key) < kMap.get(key))	{
				return false; 
			}
		}
		
		return true;
	}

	private static Map<Character, Integer> createMap(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			int count = 1;
			if (map.containsKey(key)) {
				count = map.get(key);	
				count++;
			}
			map.put(key, count);
		}
		return map;
	}

	public static void main(String[] args) {
		// keep this function call here

		String[] arr1 = { "aabdccdbcacd", "aad" };
		System.out.println("aabd" + "|" + MinWindowSubstring(arr1));

		String[] arr2 = { "ahffaksfajeeubsne", "jefaa" };
		System.out.println("aksfaje" + "|" + MinWindowSubstring(arr2));

		String[] arr3 = { "aaffhkksemckelloe", "fhea" };
		System.out.println("affhkkse" + "|" + MinWindowSubstring(arr3));
	}

}
