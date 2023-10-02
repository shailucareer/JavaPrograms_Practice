package jp_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeConstructor {

	/**
	 * Tree Constructor Have the function TreeConstructor(strArr) take the array of
	 * strings stored in strArr, which will contain pairs of integers in the
	 * following format: (i1,i2), where i1 represents a child node in a tree and the
	 * second integer i2 signifies that it is the parent of i1. For example: if
	 * strArr is ["(1,2)", "(2,4)", "(7,2)"], then this forms the following tree:
	 * 
	 * 
	 * 
	 * which you can see forms a proper binary tree. Your program should, in this
	 * case, return the string true because a valid binary tree can be formed. If a
	 * proper binary tree cannot be formed with the integer pairs, then return the
	 * string false. All of the integers within the tree will be unique, which means
	 * there can only be one node in the tree with the given integer value. Examples
	 * 
	 * Input: new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"} Output:
	 * true
	 * 
	 * Input: new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"} Output: false
	 * 
	 */

	/**
	 * Approach
	 * 
	 * Create first map for parent -> child
	 * And Create second map for child -> parent
	 * 
	 * then check in the parent map that each parent should have child more than 0 and less than or equal to 2
	 * then check in the child map that each child should have only 1 parent
	 * 
	 */

	public static String TreeCon(String[] strArr) {

		Map<String, List<String>> parentMap = createParentMap(strArr);
		Map<String, List<String>> childMap = createChildMap(strArr);

		//System.out.println(parentMap);

		boolean val1 = checkBinaryTree(parentMap, 2);
		boolean val2 = checkBinaryTree(childMap, 1);

		return (val1 && val2)+"";
	}

	private static boolean checkBinaryTree(Map<String, List<String>> map, int maxAllowed) {
		boolean val = true;

		for (String key : map.keySet()) {
			if (map.get(key).size() > maxAllowed || map.get(key).size() == 0) {
				val = false;
			}
		}

		return val;
	}

	private static Map<String, List<String>> createParentMap(String[] strArr) {
		Map<String, List<String>> map = new HashMap<>();

		for (String val : strArr) {

			val = val.replace("(", "");

			val = val.replace(")", "");

			String[] valArr = val.split(",");

			String child = valArr[0];
			String parent = valArr[1];

			List<String> childList = new ArrayList<>();

			if (map.containsKey(parent)) {
				childList = map.get(parent);
			}

			childList.add(child);

			map.put(parent, childList);
		}

		return map;
	}
	
	private static Map<String, List<String>> createChildMap(String[] strArr) {
		Map<String, List<String>> map = new HashMap<>();

		for (String val : strArr) {

			val = val.replace("(", "");

			val = val.replace(")", "");

			String[] valArr = val.split(",");

			String child = valArr[1];
			String parent = valArr[0];

			List<String> childList = new ArrayList<>();

			if (map.containsKey(parent)) {
				childList = map.get(parent);
			}

			childList.add(child);

			map.put(parent, childList);
		}

		return map;
	}

	public static void main(String[] args) {
		// keep this function call here
		System.out.println("false" + "|" + TreeCon(new String[] {"(2,5)", "(2,6)"}));
		System.out.println("true" + "|" + TreeCon(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)" }));
		System.out.println("true" + "|" + TreeCon(new String[] {"(1,2)", "(2,4)", "(7,2)"}));
		System.out.println("true" + "|" + TreeCon(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
		System.out.println("false" + "|" + TreeCon(new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"}));
		System.out.println("true" + "|" + TreeCon(new String[] {"(10,20)"}));
		System.out.println("true" + "|" + TreeCon(new String[] {"(2,3)", "(1,2)", "(4,9)", "(9,3)", "(12,9)", "(6,4)"}));
		System.out.println("false" + "|" + TreeCon(new String[] {"(2,3)", "(1,2)", "(4,9)", "(9,3)", "(12,9)", "(6,4)", "(1,9)"}));
		System.out.println("true" + "|" + TreeCon(new String[] {"(1,2)", "(2,4)", "(7,4)"}));
		System.out.println("true" + "|" + TreeCon(new String[] {"(5,6)", "(6,3)", "(2,3)", "(12,5)"}));
		System.out.println("true" + "|" + TreeCon(new String[] {"(10,20)", "(20,50)"}));
	}

}
