package StringBuilder_time;

public class Test {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("");
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 99999; i++){
		builder.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Ö´ÐÐÊ±¼ä£º" + (endTime - beginTime));//26
	}
}
