import java.util.*;

public class GenerateParentheses {
	
	static List<String> generateParenthesis(int n) {
		List <String> answers = new ArrayList<String>();
		
		generate("", n, n, answers);
		
		return answers;
	}
	
    static void generate(String comb, int open, int closed, List<String> answers) {
        
        if (open == 0 && closed == 0) {
            answers.add(comb);
            return;
        }        

        // As long as we have open parentheses left
        if (open > 0) {
            generate(comb + "(", open - 1, closed, answers);
        }

        // As long as we have more close parentheses than open parentheses
        if (closed > open) {
            generate(comb + ")", open, closed - 1, answers);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(generateParenthesis(4));
	}

}

