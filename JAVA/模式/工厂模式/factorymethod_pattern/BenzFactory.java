package factorymethod_pattern;

public class BenzFactory implements Factory{
	@Override
	public Car getCar(){
		return new Benz();
	}
}
