package simple_thread;

public class Matrix_operation {
	public static double multi(double[]row,double[]column) {
		double result=0;
		for(int i=0;i<row.length;i++)
			result=result+row[i]*column[i];
		//System.out.println(result);
		return result;
	}
}
