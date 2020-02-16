package simple_thread;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException
	{
		for (int i=5;i<1000;i=i*2) {
			double[][] result=new double[i][i];
			double[][]M=new double[i][i];
			rand_M.Rand_M(M);
			
			long startTime=System.currentTimeMillis();   //获取开始时间    
			
			for(int j=0;j<i;j++) {
				double []R=new double[i];
				double []C=new double[i];
				R=M[j];
				
				for(int k=0;k<i;k++) {
					for(int l=0;l<i;l++)
						C[l]=M[l][k];
					
					result[j][k]=Matrix_operation.multi(R,C);
				}
			}
			long endTime=System.currentTimeMillis(); //获取结束时间 
			double t=endTime-startTime;
			String s=i+","+t;
			Test test=new Test();
			test.write(s);
			System.out.println("程序运行时间： "+(endTime-startTime)+"ms"); 
			//show.Show(result);
		}
	}
	static void write(String s) throws IOException
    {
    	File f=new File("C:\\Users\\Lenovo\\Desktop\\matrix.csv");
		DataOutputStream os=new DataOutputStream(new FileOutputStream(f,true));
    	//os.write('\r');
		//os.write('\n');
		os.writeBytes(s);
    	os.close();
    }
}
