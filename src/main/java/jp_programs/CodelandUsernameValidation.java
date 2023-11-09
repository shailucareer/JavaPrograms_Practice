package jp_programs;

import java.util.regex.Pattern;

public class CodelandUsernameValidation {

	/**
	 * Have the function CodelandUsernameValidation(str) take the str parameter
	 * being passed and determine if the string is a valid username according to the
	 * following rules:
	 * 
	 * 1. The username is between 4 and 25 characters. 2. It must start with a
	 * letter. 3. It can only contain letters, numbers, and the underscore
	 * character. 4. It cannot end with an underscore character.
	 * 
	 * If the username is valid then your program should return the string true,
	 * otherwise return the string false.
	 */
	public static String validation(String str) {
		// code goes here
		boolean p = Pattern.matches("[a-zA-Z]{1}[\\w*]{1,23}[^_]{1}", str);
		return p + "";
	}

	public static void main(String[] args) {
		// keep this function call here
		System.out.println("true |"+validation("u__hello_world123"));
		System.out.println("false |"+validation("aa_"));
		System.out.println("true |"+validation("aaaaaaaaaa"));
		System.out.println("true |"+validation("usernamehello123"));
		System.out.println("false |"+validation("oooooooooooooooooo________a"));
		System.out.println("false |"+validation("123abc444"));
	}

}
