
public class RotateMatrix {

	public static void main(String[] args) {
		
		int[][] m1 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int[][] m2 = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(m1);
		System.out.println();
		rotate(m2);
	}
	
	public static void rotate(int[][] matrix) {
		
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
	}
}
