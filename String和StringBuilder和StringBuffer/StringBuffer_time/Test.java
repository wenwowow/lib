package StringBuffer_time;

public class Test {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("");
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 999999; i++){
		buffer.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ִ��ʱ�䣺" + (endTime - beginTime));//107
	}
}
