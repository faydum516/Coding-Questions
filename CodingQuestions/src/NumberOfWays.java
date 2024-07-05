import java.util.ArrayList;
import java.util.Stack;

public class NumberOfWays {

	public static void main(String[] args) {
		System.out.println(numOfWays(2, 3));
		System.out.println(numOfWays(2, 2));
		System.out.println(numOfWays(2, 4));
		System.out.println(numOfWays(2, 5));
		System.out.println(numOfWays(3, 5));
	}
	
    public static int numOfWays(int K, int N) {
        ArrayList<Stack<Integer>> answers = new ArrayList<Stack<Integer>>();

        Stack<Integer> comb = new Stack<Integer>();

        generate(K, N, comb, answers);

        return answers.size();
    }

    public static void generate(int K, int N, Stack<Integer> comb, ArrayList<Stack<Integer>> answers) {

        if (N <= 0) {
        	answers.add(comb);
            return;
        }

        for (int num = 1; num <= K && num <= N; num++) {
        	comb.push(num);
            generate(K, N - num, comb, answers);
            comb.pop();
        }
    }
}
