
public class ArrayTranspose {

		public static void main(String args[])
		{
			// initialize the array of 3*3 order
			int[][] arr = new int[3][3];

			System.out.println("enter the elements of matrix");

			int k = 1;

			// get the elements from user
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					arr[i][j] = k++;
				}
			}

			System.out.println("Matrix before Transpose ");

			// display original matrix
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(" " + arr[i][j]);
				}
				System.out.println();
			}

			System.out.println("Matrix After Transpose ");

			// transpose and print matrix
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(" " + arr[j][i]);
				}
				System.out.println();
			}
		}
	

}
