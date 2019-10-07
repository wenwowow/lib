package simplefactory_pattern;

public class SimpleFactory {
	public Car getcar(String name) {
		if(name.equals("BMW")) {
			return new BMW();
		}else if(name.equals("Benz")) {
			return new Benz();
		}
		else {
			System.out.println("这个品牌的车无法生产");
			return null;
		}
	}
}
