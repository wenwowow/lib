package multi_thread;

public class PrimeThread implements Runnable{
	private double[][] M;
	private int j;
	
	public PrimeThread (double[][] m){
		this.M=m;
		j=0;
	}
	
	@Override
	public void run(){
		int N=M.length;
		while(true) {
			synchronized(this) {
				if(j<N)
				{
					double []R=new double[N];
					double []C=new double[N];
					double[][] result=new double[N][N];
					R=M[j];

					for(int k=0;k<N;k++) {
						for(int l=0;l<N;l++)
							C[l]=M[l][k];
						
						result[j][k]=Matrix_operation.multi(R,C);
					}
					j+=1;
					//System.out.println(j);
				}
				else {
					break;
				}
			}
		}
			
		
	}


}
