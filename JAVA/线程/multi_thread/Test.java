package multi_thread;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException
	{
		for (int i=5;i<1000;i=i*2) {
			double[][]M=new double[i][i];
			rand_M.Rand_M(M);
			PrimeThread thread=new PrimeThread(M);
			
			Thread s1=new Thread(thread);
			Thread s2=new Thread(thread);
			s1.setName("A");
			s2.setName("B");
			
			long startTime=System.currentTimeMillis();  
			s1.start();
			s2.start();
			long endTime=System.currentTimeMillis();
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
    	File f=new File("C:\\Users\\Lenovo\\Desktop\\matrix1.csv");
		DataOutputStream os=new DataOutputStream(new FileOutputStream(f,true));
    	//os.write('\r');
		//os.write('\n');
		os.writeBytes(s);
    	os.close();
    }
}
