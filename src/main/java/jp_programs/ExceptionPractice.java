package jp_programs;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		String val = getValue(0);
		System.out.println(val);
	}

	private static String getValue(int j) {
		int i = 1;
		
		String s = "";
		try {
			return s += "Try :- "+(i/j);
		}catch (Exception e) {
			return s +="Exception";
		}finally {
			return s +="Finally";
		}
	}
	
}
