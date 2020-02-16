package abstractfactory_patttern;

public class AudiFactory extends AbstractFactory{
	@Override
	public Car getCar() {
		return new Audi();
	}
}
