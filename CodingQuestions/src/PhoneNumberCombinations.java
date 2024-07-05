import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PhoneNumberCombinations {

	public static void main(String[] args) {
		System.out.println(combinations("68"));
		System.out.println(combinations("438"));
	}
	
	public static List<String> combinations(String digits) {
		
		List<String> combinations = new ArrayList<String>();
		
		generateCombinations(digits, "", combinations);
		
		return combinations;
	}
	
	public static void generateCombinations(String digits, String combination, List<String> answers) {
		
		if (digits.length() == 0) {
			answers.add(combination);
			return;
		}
		
		HashMap<Character, String> digitMap = new HashMap<Character, String>();
		digitMap.put('2', "abc");
		digitMap.put('3', "def");
		digitMap.put('4', "ghi");
		digitMap.put('5', "jkl");
		digitMap.put('6', "mno");
		digitMap.put('7', "pqrs");
		digitMap.put('8', "tuv");
		digitMap.put('9', "wxyz");
		
		String digitLetters = digitMap.get(digits.charAt(0));
		
		for (int i = 0; i < digitLetters.length(); i++) {
			generateCombinations(digits.substring(1), combination + digitLetters.charAt(i), answers);
		}
	}

}
