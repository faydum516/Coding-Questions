
public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] twod = { { 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};
		final int LIM = twod.length;
		for (int j = 0; j < LIM; j++)
			for (int k = 0; k < LIM; k++)
				if (j < k) {
					int x = twod[j][k];
					twod[j][k] = twod[k][j];
					twod[k][j] = x;
				}
		for (int i = 0; i < twod.length; i++) {
			for (int j = 0; j < twod[i].length; j++) {
				System.out.print(twod[i][j] + "\t");
			}
			System.out.println();
		}
		
		float[] arr = {12, 3, 1, 9, 2, 8, 13, 12, 4, 18, 20, 15, 16};
		arrange(arr);
	}
	
	static void arrange(float[] ary) {
		for (int n=0; n<ary.length; n++)
			for (int k=n; k<ary.length; k++)
				if (ary[n] > ary[k]) {
					float x = ary[n];
					ary[n] = ary[k];
					ary[k] = x;
				}
		
		for (int i = 0; i < ary.length; i++) System.out.print(ary[i] + "\t");
	}

}
