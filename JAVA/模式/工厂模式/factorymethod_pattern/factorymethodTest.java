package factorymethod_pattern;

public class factorymethodTest {
	public static void main(String[] args) {
		Factory bmwFactory=new BMWFactory();
		System.out.println(bmwFactory.getCar().getname());
		Factory benzFactory=new BenzFactory();
		System.out.println(benzFactory.getCar().getname());
	}
}
