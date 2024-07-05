
public class GoldenLetters {

	public static void main(String[] args) {
		System.out.println(goldenLetters("lWwxyZ", "lmnoWwwxyZ"));
	}
	
	public static int goldenLetters(String key, String str) {
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (key.contains("" + str.charAt(i) + "")) {
				num++;
			}
		}
		return num;
	}
}
