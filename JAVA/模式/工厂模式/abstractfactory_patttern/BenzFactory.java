package abstractfactory_patttern;

public class BenzFactory extends AbstractFactory{
	@Override
	public Car getCar() {
		return new Benz();
	}
}
