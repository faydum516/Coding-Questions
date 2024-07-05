import java.util.HashMap;

public class DestroyThosePairs {

	public static void main(String[] args) {
		
		System.out.println(strNoPair("abcddced"));
		System.out.println(strNoPair("aabcdcedca"));

	}
	
	public static String strNoPair(String str) {
		
		HashMap <Character, Integer> charChecker = new HashMap<Character, Integer>();
		
		String newStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			charChecker.put(str.charAt(i), charChecker.getOrDefault(str.charAt(i), 0) + 1);
			if (charChecker.get(str.charAt(i)) == 2) {
				charChecker.remove(str.charAt(i));
				newStr = newStr.replace("" + str.charAt(i) + "", "");
			}
			else newStr += str.charAt(i);
		}
		
		return newStr;
	}
}
