package String_time;

public class Test {
	public static void main(String[] args) {
		String str = "";
		long beginTime = System.currentTimeMillis();

		for (int i = 0; i < 999; i++){
		str = str + i;
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Ö´ÐÐÊ±¼ä£º" + (endTime - beginTime));
	}
}
