package factorymethod_pattern;

public class BMWFactory implements Factory{
	@Override
	public Car getCar(){
		return new BMW();
	}
}

