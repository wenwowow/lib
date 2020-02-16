package simple_thread;

public class show {
	public static void Show(double[][]Matrix) {
		for(int row=0;row<Matrix.length;row++)
		{
			for(int col=0;col<Matrix[0].length;col++)
				System.out.print(Matrix[row][col]+" ");
			System.out.print('\n');
		}
	}
}
