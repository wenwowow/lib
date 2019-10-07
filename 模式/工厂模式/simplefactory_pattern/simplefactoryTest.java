package simplefactory_pattern;

public class simplefactoryTest {
	public static void main(String[] args) {
		SimpleFactory simplefactory=new SimpleFactory();
		Car car=simplefactory.getcar("BMW");
		System.out.println(car.getname());
	}
}
