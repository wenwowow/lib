package abstractfactory_patttern;

public class BmwFactory extends AbstractFactory{
	@Override
	public Car getCar() {
		return new BMW();
	}
}
