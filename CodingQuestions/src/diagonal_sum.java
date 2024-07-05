import java.util.Scanner;

public class diagonal_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a square side: ");
		int square_side = sc.nextInt();
		
		int arr[][] = new int[square_side][square_side];
		int num = 1;
		for (int i = 0; i < square_side; i++) {
			for (int j = 0; j < square_side; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr.length - 1 - i != i) sum += arr[i][i] + arr[arr.length - 1 - i][i];
			else sum += arr[i][i];
		}
		System.out.println(sum);
		sc.close();
	}
}
