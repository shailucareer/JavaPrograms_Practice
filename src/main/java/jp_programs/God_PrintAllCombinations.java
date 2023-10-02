package jp_programs;

public class God_PrintAllCombinations {

	/**
	 * Problem statement:- 
	 * Write a Java program to print all permutations of a given String. For
	 * example, if given String is "GOD" then your program should print all 6
	 * permutations of this string, e.g. "GOD," "OGD," "DOG," "GDO," "ODG," and
	 * "DGO."
	 */

	
	/**
	 * Approach/Algorithm/pseudocode
	 * 
	 *  String val = GOD
	 *  
	 *  COUNTER = val.length();
	 *  
	 *	for iteration = 0 to COUNTER(g>d) { 
	 *		String output = "";
	 *		for start = iteration to iteration+COUNTER {
	 *			int index = start;
	 *			if start >= COUNTER {
	 *				index = start-COUNTER;
	 *			}
	 *		 	output = output + val.charAt(index);
	 *		}
	 *		print output = GOD
	 *	}
	 *
	 *	for iteration = COUNTER-1 to 0(d>g) { 
	 *		String output = "";
	 *		for start = iteration(1)+COUNTER(3) to iteration(1) {
	 *			int index = start;(2)
	 *			if start(2) >= COUNTER(3) {
	 *				index = start-COUNTER;(0)
	 *			}
	 *		 	output = output + val.charAt(index);
	 *		}
	 *		print output = GOD
	 *	}
	 * 	
	 */
	
	public static void main(String[] args) {
		
		   String val = "GOD";
		   
		   int COUNTER = val.length();
		   
		 	for(int iteration = 0; iteration<COUNTER;iteration++) { 
		 		String output = "";
		 		for(int start = iteration;start<iteration+COUNTER;start++) {
		 			int index = start;
		 			if(start >= COUNTER ){
		 				index = start-COUNTER;
		 			}
		 		 	output = output + val.charAt(index);
		 		}
		 		System.out.println(output);
		 	}
		 
		 	for(int iteration = COUNTER-1;iteration>=0; iteration--) { 
		 		String output = "";
		 		for(int start = iteration+COUNTER;start>iteration;start--) {
		 			int index = start;
		 			if(start >= COUNTER) {
		 				index = start-COUNTER;
		 			}
		 		 	output = output + val.charAt(index);
		 		}
		 		System.out.println(output);
		 	}
		  	
		 
	}
	
}
