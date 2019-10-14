package simple_thread;

public class rand_M {
	public static void Rand_M(double [][]M){
		for (int i=0;i<M.length;i++) {
			for(int j=0;j<M[0].length;j++)
				M[i][j]=Math.random();
		}
	}
}
